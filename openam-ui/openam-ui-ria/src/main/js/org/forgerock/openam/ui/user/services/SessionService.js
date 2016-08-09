/*
 * The contents of this file are subject to the terms of the Common Development and
 * Distribution License (the License). You may not use this file except in compliance with the
 * License.
 *
 * You can obtain a copy of the License at legal/CDDLv1.0.txt. See the License for the
 * specific language governing permission and limitations under the License.
 *
 * When distributing Covered Software, include this CDDL Header Notice in each file and include
 * the License file at legal/CDDLv1.0.txt. If applicable, add the following below the CDDL
 * Header, with the fields enclosed by brackets [] replaced by your own identifying
 * information: "Portions copyright [year] [name of copyright owner]".
 *
 * Portions copyright 2014-2016 ForgeRock AS.
 */

define([
    "lodash",
    "org/forgerock/commons/ui/common/main/AbstractDelegate",
    "org/forgerock/commons/ui/common/util/Constants"
], (_, AbstractDelegate, Constants) => {
    const obj = new AbstractDelegate(`${Constants.host}/${Constants.context}/json/sessions`);

    function performServiceCall (options) {
        return obj.serviceCall(_.merge({
            type: "POST",
            data: {},
            headers: { "Accept-API-Version": "protocol=1.0,resource=1.1" },
            errorsHandlers: { "Bad Request": { status: 400 } }
        }, options));
    }

    obj.getMaxIdle = function (token) {
        return performServiceCall({
            url: `?_action=getMaxIdle&tokenId=${token}`,
            suppressSpinner: true
        });
    };

    obj.getTimeLeft = function (token) {
        return performServiceCall({
            url: `?_action=getTimeLeft&tokenId=${token}`,
            suppressSpinner: true
        });
    };

    obj.getSessionInfo = (token) => {
        return obj.serviceCall({
            url: `/${token}`,
            headers: { "Accept-API-Version": "protocol=1.0,resource=2.0" },
            errorsHandlers: { "Unauthorized": { status: 401 } }
        });
    };

    obj.isSessionValid = function (token) {
        return performServiceCall({
            url: `/${token}?_action=validate`
        });
    };

    obj.logout = function (token) {
        return performServiceCall({
            url: `/${token}?_action=logout`
        });
    };

    return obj;
});

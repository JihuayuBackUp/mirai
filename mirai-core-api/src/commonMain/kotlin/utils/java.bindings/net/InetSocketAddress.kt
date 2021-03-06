/*
 * Copyright 2019-2020 Mamoe Technologies and contributors.
 *
 *  此源代码的使用受 GNU AFFERO GENERAL PUBLIC LICENSE version 3 许可证的约束, 可以在以下链接找到该许可证.
 *  Use of this source code is governed by the GNU AGPLv3 license that can be found through the following link.
 *
 *  https://github.com/mamoe/mirai/blob/master/LICENSE
 */

@file:Suppress(
    "unused",
    "NO_ACTUAL_FOR_EXPECT",
    "PackageDirectoryMismatch",
    "NON_FINAL_MEMBER_IN_FINAL_CLASS",
    "VIRTUAL_MEMBER_HIDDEN",
    "RedundantModalityModifier",
    "REDUNDANT_MODIFIER_FOR_TARGET",
    "REDUNDANT_OPEN_IN_INTERFACE",
    "NON_FINAL_MEMBER_IN_OBJECT",
    "ConvertSecondaryConstructorToPrimary"
)

/**
 * Bindings for JDK.
 *
 * All the sources are copied from OpenJDK. Copyright OpenJDK authors.
 */

package java.net

import kotlin.jvm.JvmStatic

public expect open class InetSocketAddress : SocketAddress {
    public constructor(port: Int)
    public constructor(addr: InetAddress, port: Int)
    public constructor(hostname: String, port: Int)

    public final fun getPort(): Int
    public final fun getAddress(): InetAddress
    public final fun getHostName(): String
    public final fun getHostString(): String
    public final fun isUnresolved(): Boolean
    public open fun toString(): String
    public final fun equals(obj: Any?): Boolean
    public final fun hashCode(): Int

    public companion object {
        @JvmStatic
        public open fun createUnresolved(host: String, port: Int): InetSocketAddress
    }
}  
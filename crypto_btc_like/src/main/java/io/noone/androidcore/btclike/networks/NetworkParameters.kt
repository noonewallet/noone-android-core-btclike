package io.noone.androidcore.btclike.networks

import io.noone.androidcore.btclike.transaction.HashType

abstract class NetworkParameters {
    abstract val addressHeader: Int
    abstract val p2SHHeader: Int
    abstract val dumpedPrivateKeyHeader: Int

    open val segwitAddressHrp: String? = null
    open val hashType: HashType = HashType.REVERSED

}
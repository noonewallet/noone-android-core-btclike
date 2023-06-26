package io.noone.androidcore.btclike.networks

import io.noone.androidcore.btclike.transaction.HashType

object BchParams : NetworkParameters() {
    override val dumpedPrivateKeyHeader = 128
    override val addressHeader = 0
    override val p2SHHeader = 5
    override val segwitAddressHrp = "bitcoincash"
    override val hashType: HashType
        get() = HashType.DEFAULT
}
package io.noone.androidcore.btclike.networks

object LitecoinParams : NetworkParameters() {
    override val addressHeader = 48
    override val dumpedPrivateKeyHeader = 128 + addressHeader
    override val p2SHHeader = 50
    override val segwitAddressHrp = "ltc"
}
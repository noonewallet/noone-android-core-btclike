package io.noone.androidcore.btclike.networks

object BitcoinParams : NetworkParameters() {
    override val dumpedPrivateKeyHeader = 128
    override val addressHeader = 0
    override val p2SHHeader = 5
    override val segwitAddressHrp = "bc"
}
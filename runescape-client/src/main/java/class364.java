import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("od")
public class class364 {
	@ObfuscatedName("nj")
	@ObfuscatedSignature(
		descriptor = "([BII)V",
		garbageValue = "-2005784684"
	)
	@Export("VorbisSample_setData")
	static void VorbisSample_setData(byte[] var0, int var1) {
		if (Client.randomDatData == null) { // L: 12764
			Client.randomDatData = new byte[24];
		}

		class409.writeRandomDat(var0, var1, Client.randomDatData, 0, 24); // L: 12765
	} // L: 12766
}

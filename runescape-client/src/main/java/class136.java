import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("et")
public class class136 {
	@ObfuscatedName("v")
	public short[] field1542;
	@ObfuscatedName("y")
	public short[] field1541;

	class136(int var1) {
		ItemComposition var2 = class250.ItemDefinition_get(var1);
		if (var2.method3086()) {
			this.field1542 = new short[var2.recolorTo.length];
			System.arraycopy(var2.recolorTo, 0, this.field1542, 0, this.field1542.length);
		}

		if (var2.method3139()) {
			this.field1541 = new short[var2.retextureTo.length];
			System.arraycopy(var2.retextureTo, 0, this.field1541, 0, this.field1541.length);
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1546323198"
	)
	public static boolean method2696(int var0, int var1) {
		return (var0 >> var1 + 1 & 1) != 0;
	}
}

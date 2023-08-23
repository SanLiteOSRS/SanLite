import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hq")
public class class194 {
	@ObfuscatedName("hr")
	static int[] field2029;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		longValue = -3325561176002089741L
	)
	public long field2026;
	@ObfuscatedName("ae")
	int[] field2024;
	@ObfuscatedName("ao")
	short[] field2025;
	@ObfuscatedName("at")
	short[] field2027;
	@ObfuscatedName("ac")
	public boolean field2028;

	public class194(long var1, int[] var3, short[] var4, short[] var5, boolean var6) {
		this.field2028 = false; // L: 8
		this.field2026 = var1; // L: 11
		this.field2024 = var3; // L: 12
		this.field2025 = var4; // L: 13
		this.field2027 = var5; // L: 14
		this.field2028 = var6; // L: 15
	} // L: 16

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "29"
	)
	public static int method3686(int var0) {
		return var0 >>> 4 & class508.field5059; // L: 22
	}

	@ObfuscatedName("nc")
	@ObfuscatedSignature(
		descriptor = "(Lmi;I)I",
		garbageValue = "-282927864"
	)
	@Export("getWidgetFlags")
	static int getWidgetFlags(Widget var0) {
		IntegerNode var1 = (IntegerNode)Client.widgetFlags.get((long)var0.childIndex + ((long)var0.id << 32)); // L: 12678
		return var1 != null ? var1.integer : var0.flags; // L: 12679 12680
	}
}

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fm")
@Implements("Clock")
public abstract class Clock {
	@ObfuscatedName("rd")
	@ObfuscatedGetter(
		intValue = -1841661257
	)
	static int field2079;

	Clock() {
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		garbageValue = "46",
		signature = "(B)V"
	)
	@Export("mark")
	public abstract void mark();

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		garbageValue = "1861957348",
		signature = "(III)I"
	)
	@Export("wait")
	public abstract int wait(int var1, int var2);

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		garbageValue = "-59",
		signature = "(Lkx;Ljava/lang/String;B)I"
	)
	public static int method3721(Buffer var0, String var1) {
		int var2 = var0.offset;
		byte[] var3 = class3.method40(var1);
		var0.writeSmartByteShort(var3.length);
		var0.offset += class219.huffman.compress(var3, 0, var3.length, var0.array, var0.offset);
		return var0.offset - var2;
	}
}

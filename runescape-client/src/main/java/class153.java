import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fp")
public class class153 extends class161 {
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = -149781849
	)
	static int field1693;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 679928023
	)
	int field1692;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgf;"
	)
	final class162 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgf;)V"
	)
	class153(class162 var1) {
		this.this$0 = var1;
		this.field1692 = -1; // L: 84
	} // L: 86

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lul;B)V",
		garbageValue = "0"
	)
	void vmethod3405(Buffer var1) {
		this.field1692 = var1.readUnsignedShort(); // L: 89
		var1.readUnsignedByte(); // L: 90
		if (var1.readUnsignedByte() != 255) { // L: 91
			--var1.offset; // L: 92
			var1.readLong(); // L: 93
		}

	} // L: 95

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lgb;B)V",
		garbageValue = "0"
	)
	void vmethod3411(ClanChannel var1) {
		var1.removeMember(this.field1692); // L: 98
	} // L: 99

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)I",
		garbageValue = "125"
	)
	public static int method3220(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) { // L: 17
			int var6 = var3; // L: 18
			var3 = var4; // L: 19
			var4 = var6; // L: 20
		}

		var2 &= 3; // L: 22
		if (var2 == 0) { // L: 23
			return var0;
		} else if (var2 == 1) { // L: 24
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 - (var3 - 1) : 7 - var1 - (var4 - 1); // L: 25 26
		}
	}

	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "(I)Ltu;",
		garbageValue = "-496192767"
	)
	@Export("getWorldMap")
	static WorldMap getWorldMap() {
		return class434.worldMap; // L: 742
	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "107"
	)
	static final int method3210(int var0) {
		return Math.min(Math.max(var0, 128), 383); // L: 4035
	}

	@ObfuscatedName("lc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIII)V",
		garbageValue = "1948900436"
	)
	@Export("insertMenuItemNoShift")
	public static final void insertMenuItemNoShift(String var0, String var1, int var2, int var3, int var4, int var5) {
		class208.method3848(var0, var1, var2, var3, var4, var5, -1, false); // L: 10292
	} // L: 10293
}

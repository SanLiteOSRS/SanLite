import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gh")
public class class160 extends class145 {
	@ObfuscatedName("om")
	@ObfuscatedGetter(
		intValue = -835996991
	)
	static int field1778;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		longValue = -7591806367221592461L
	)
	long field1777;
	@ObfuscatedName("aw")
	String field1776;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -175107393
	)
	int field1775;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	final class148 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfg;)V"
	)
	class160(class148 var1) {
		this.this$0 = var1;
		this.field1777 = -1L; // L: 93
		this.field1776 = null; // L: 94
		this.field1775 = 0; // L: 95
	} // L: 97

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "584073694"
	)
	void vmethod3512(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 100
			--var1.offset; // L: 101
			this.field1777 = var1.readLong(); // L: 102
		}

		this.field1776 = var1.readStringCp1252NullTerminatedOrNull(); // L: 104
		this.field1775 = var1.readUnsignedShort(); // L: 105
	} // L: 106

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgt;I)V",
		garbageValue = "406847376"
	)
	void vmethod3513(ClanSettings var1) {
		var1.method3362(this.field1777, this.field1776, this.field1775); // L: 109
	} // L: 110

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1817056438"
	)
	static boolean method3419(int var0, int var1) {
		return var0 != 4 || var1 < 8; // L: 26
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lof;Lof;IZI)Lks;",
		garbageValue = "-1328743255"
	)
	public static Frames method3430(AbstractArchive var0, AbstractArchive var1, int var2, boolean var3) {
		boolean var4 = true; // L: 11
		int[] var5 = var0.getGroupFileIds(var2); // L: 12

		for (int var6 = 0; var6 < var5.length; ++var6) { // L: 13
			byte[] var7 = var0.getFile(var2, var5[var6]);
			if (var7 == null) {
				var4 = false; // L: 16
			} else {
				int var8 = (var7[0] & 255) << 8 | var7[1] & 255; // L: 19
				byte[] var9;
				if (var3) { // L: 21
					var9 = var1.getFile(0, var8);
				} else {
					var9 = var1.getFile(var8, 0); // L: 22
				}

				if (var9 == null) { // L: 23
					var4 = false;
				}
			}
		}

		if (!var4) { // L: 25
			return null;
		} else {
			try {
				return new Frames(var0, var1, var2, var3); // L: 27
			} catch (Exception var11) { // L: 29
				return null; // L: 30
			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-1"
	)
	public static void method3424() {
		class174.field1849.clear(); // L: 14
	} // L: 15

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1866097351"
	)
	@Export("savePreferences")
	static void savePreferences() {
		AccessFile var0 = null; // L: 141

		try {
			var0 = VarcInt.getPreferencesFile("", KeyHandler.field151.name, true); // L: 143
			Buffer var1 = class30.clientPreferences.toBuffer(); // L: 144
			var0.write(var1.array, 0, var1.offset); // L: 145
		} catch (Exception var3) { // L: 147
		}

		try {
			if (var0 != null) { // L: 149
				var0.closeSync(true); // L: 150
			}
		} catch (Exception var2) { // L: 153
		}

	} // L: 154
}

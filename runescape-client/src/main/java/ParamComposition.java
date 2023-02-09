import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gy")
@Implements("ParamComposition")
public class ParamComposition extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("ParamDefinition_archive")
	public static AbstractArchive ParamDefinition_archive;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	@Export("ParamComposition_cached")
	public static EvictingDualNodeHashTable ParamComposition_cached;
	@ObfuscatedName("hh")
	@ObfuscatedGetter(
		intValue = -1984383565
	)
	@Export("baseX")
	static int baseX;
	@ObfuscatedName("v")
	@Export("type")
	char type;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1399796535
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("z")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("j")
	@Export("autoDisable")
	boolean autoDisable;

	static {
		ParamComposition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	ParamComposition() {
		this.autoDisable = true; // L: 16
	} // L: 18

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-406747783"
	)
	@Export("postDecode")
	void postDecode() {
	} // L: 31

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lrd;I)V",
		garbageValue = "-540226117"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 35
			if (var2 == 0) { // L: 36
				return; // L: 39
			}

			this.decodeNext(var1, var2); // L: 37
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lrd;IB)V",
		garbageValue = "76"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 42
			byte var4 = var1.readByte(); // L: 44
			int var5 = var4 & 255; // L: 46
			if (var5 == 0) { // L: 47
				throw new IllegalArgumentException("" + Integer.toString(var5, 16));
			}

			if (var5 >= 128 && var5 < 160) { // L: 48
				char var6 = class362.cp1252AsciiExtension[var5 - 128]; // L: 49
				if (var6 == 0) { // L: 50
					var6 = '?';
				}

				var5 = var6; // L: 51
			}

			char var3 = (char)var5; // L: 53
			this.type = var3; // L: 55
		} else if (var2 == 2) { // L: 57
			this.defaultInt = var1.readInt();
		} else if (var2 == 4) { // L: 58
			this.autoDisable = false;
		} else if (var2 == 5) { // L: 59
			this.defaultStr = var1.readStringCp1252NullTerminated();
		}

	} // L: 61

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	@Export("isString")
	public boolean isString() {
		return this.type == 's'; // L: 64
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIII)J",
		garbageValue = "2043821642"
	)
	static long method3840(int var0, int var1, int var2) {
		return (long)(var2 << 16 | var0 << 8 | var1); // L: 38
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IZI)Ljava/lang/String;",
		garbageValue = "836612090"
	)
	@Export("intToString")
	public static String intToString(int var0, boolean var1) {
		return var1 && var0 >= 0 ? BuddyRankComparator.method2965(var0, 10, var1) : Integer.toString(var0); // L: 115 116
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1155689918"
	)
	public static String method3842(String var0) {
		int var1 = var0.length(); // L: 167
		char[] var2 = new char[var1]; // L: 168
		byte var3 = 2; // L: 169

		for (int var4 = 0; var4 < var1; ++var4) { // L: 170
			char var5 = var0.charAt(var4); // L: 171
			if (var3 == 0) { // L: 172
				var5 = Character.toLowerCase(var5);
			} else if (var3 == 2 || Character.isUpperCase(var5)) { // L: 173
				var5 = class302.method5863(var5);
			}

			if (Character.isLetter(var5)) { // L: 174
				var3 = 0;
			} else if (var5 != '.' && var5 != '?' && var5 != '!') { // L: 175
				if (Character.isSpaceChar(var5)) { // L: 176
					if (var3 != 2) { // L: 177
						var3 = 1;
					}
				} else {
					var3 = 1; // L: 179
				}
			} else {
				var3 = 2;
			}

			var2[var4] = var5; // L: 180
		}

		return new String(var2); // L: 182
	}

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-366230260"
	)
	@Export("drawScrollBar")
	static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
		InvDefinition.scrollBarSprites[0].drawAt(var0, var1); // L: 11538
		InvDefinition.scrollBarSprites[1].drawAt(var0, var3 + var1 - 16); // L: 11539
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field575); // L: 11540
		int var5 = var3 * (var3 - 32) / var4; // L: 11541
		if (var5 < 8) { // L: 11542
			var5 = 8;
		}

		int var6 = (var3 - 32 - var5) * var2 / (var4 - var3); // L: 11543
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var6 + var1 + 16, 16, var5, Client.field576); // L: 11544
		Rasterizer2D.method8990(var0, var6 + var1 + 16, var5, Client.field636); // L: 11545
		Rasterizer2D.method8990(var0 + 1, var6 + var1 + 16, var5, Client.field636); // L: 11546
		Rasterizer2D.method9014(var0, var6 + var1 + 16, 16, Client.field636); // L: 11547
		Rasterizer2D.method9014(var0, var6 + var1 + 17, 16, Client.field636); // L: 11548
		Rasterizer2D.method8990(var0 + 15, var6 + var1 + 16, var5, Client.field656); // L: 11549
		Rasterizer2D.method8990(var0 + 14, var6 + var1 + 17, var5 - 1, Client.field656); // L: 11550
		Rasterizer2D.method9014(var0, var6 + var5 + var1 + 15, 16, Client.field656); // L: 11551
		Rasterizer2D.method9014(var0 + 1, var5 + var6 + var1 + 14, 15, Client.field656); // L: 11552
	} // L: 11553
}

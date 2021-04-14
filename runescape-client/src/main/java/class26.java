import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ac")
public class class26 extends class14 {
	@ObfuscatedName("ag")
	@Export("fontHelvetica13")
	static java.awt.Font fontHelvetica13;
	@ObfuscatedName("kb")
	@ObfuscatedGetter(
		intValue = 1665107069
	)
	@Export("Client_plane")
	static int Client_plane;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		longValue = 1455958223078858959L
	)
	long field201;
	@ObfuscatedName("o")
	String field206;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1831814193
	)
	int field205;
	// $FF: synthetic field
	@ObfuscatedSignature(
		signature = "Lu;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		signature = "(Lu;)V"
	)
	class26(class2 var1) {
		this.this$0 = var1;
		this.field201 = -1L;
		this.field206 = null;
		this.field205 = 0;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lnu;I)V",
		garbageValue = "-1383981708"
	)
	void vmethod371(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field201 = var1.readLong();
		}

		this.field206 = var1.readStringCp1252NullTerminatedOrNull();
		this.field205 = var1.readUnsignedShort();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lm;I)V",
		garbageValue = "-1475503816"
	)
	void vmethod376(class11 var1) {
		var1.method146(this.field201, this.field206, this.field205);
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(IIII)V",
		garbageValue = "2019211946"
	)
	static final void method368(int var0, int var1, int var2) {
		int var3;
		for (var3 = 0; var3 < 8; ++var3) {
			for (int var4 = 0; var4 < 8; ++var4) {
				Tiles.Tiles_heights[var0][var3 + var1][var4 + var2] = 0;
			}
		}

		if (var1 > 0) {
			for (var3 = 1; var3 < 8; ++var3) {
				Tiles.Tiles_heights[var0][var1][var3 + var2] = Tiles.Tiles_heights[var0][var1 - 1][var3 + var2];
			}
		}

		if (var2 > 0) {
			for (var3 = 1; var3 < 8; ++var3) {
				Tiles.Tiles_heights[var0][var3 + var1][var2] = Tiles.Tiles_heights[var0][var3 + var1][var2 - 1];
			}
		}

		if (var1 > 0 && Tiles.Tiles_heights[var0][var1 - 1][var2] != 0) {
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1 - 1][var2];
		} else if (var2 > 0 && Tiles.Tiles_heights[var0][var1][var2 - 1] != 0) {
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1][var2 - 1];
		} else if (var1 > 0 && var2 > 0 && Tiles.Tiles_heights[var0][var1 - 1][var2 - 1] != 0) {
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1 - 1][var2 - 1];
		}

	}

	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		signature = "(Lcd;I)V",
		garbageValue = "-327078650"
	)
	static final void method367(Actor var0) {
		int var1 = Math.max(1, var0.field1255 - Client.cycle);
		int var2 = var0.field1240 * 128 + var0.field1258 * 64;
		int var3 = var0.field1253 * 128 + var0.field1258 * 64;
		var0.x += (var2 - var0.x) / var1;
		var0.y += (var3 - var0.y) / var1;
		var0.field1267 = 0;
		var0.orientation = var0.field1213;
	}

	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "1581962247"
	)
	static void method357(int var0, int var1) {
		MenuAction var2 = class25.tempMenuAction;
		UserComparator9.menuAction(var2.param0, var2.param1, var2.opcode, var2.identifier, var2.action, var2.action, var0, var1);
		class25.tempMenuAction = null;
	}
}

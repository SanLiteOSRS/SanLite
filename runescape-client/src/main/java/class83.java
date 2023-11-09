import java.awt.Component;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cj")
public enum class83 implements MouseWheel {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	field1076(0, -1),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	field1073(1, 2),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	field1075(2, 3),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	field1081(3, 4),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	field1077(4, 5),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	field1078(5, 6);

	@ObfuscatedName("tj")
	@ObfuscatedGetter(
		intValue = -1155769579
	)
	static int field1082;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("worldMapEvent")
	static WorldMapEvent worldMapEvent;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1466506935
	)
	final int field1074;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1935588787
	)
	final int field1080;

	class83(int var3, int var4) {
		this.field1074 = var3; // L: 21
		this.field1080 = var4; // L: 22
	} // L: 23

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1790946346"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1080; // L: 27
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;B)V",
		garbageValue = "105"
	)
	static void method2189(Component var0) {
		var0.removeMouseListener(MouseHandler.MouseHandler_instance); // L: 43
		var0.removeMouseMotionListener(MouseHandler.MouseHandler_instance); // L: 44
		var0.removeFocusListener(MouseHandler.MouseHandler_instance); // L: 45
		MouseHandler.MouseHandler_currentButtonVolatile = 0; // L: 46
	} // L: 47

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "2009179115"
	)
	@Export("SpriteBuffer_decode")
	public static void SpriteBuffer_decode(byte[] var0) {
		Buffer var1 = new Buffer(var0); // L: 199
		var1.offset = var0.length - 2; // L: 200
		class457.SpriteBuffer_spriteCount = var1.readUnsignedShort(); // L: 201
		class267.SpriteBuffer_xOffsets = new int[class457.SpriteBuffer_spriteCount]; // L: 202
		class457.SpriteBuffer_yOffsets = new int[class457.SpriteBuffer_spriteCount]; // L: 203
		class457.SpriteBuffer_spriteWidths = new int[class457.SpriteBuffer_spriteCount]; // L: 204
		Decimator.SpriteBuffer_spriteHeights = new int[class457.SpriteBuffer_spriteCount]; // L: 205
		class436.SpriteBuffer_pixels = new byte[class457.SpriteBuffer_spriteCount][]; // L: 206
		var1.offset = var0.length - 7 - class457.SpriteBuffer_spriteCount * 8; // L: 207
		class457.SpriteBuffer_spriteWidth = var1.readUnsignedShort(); // L: 208
		class457.SpriteBuffer_spriteHeight = var1.readUnsignedShort(); // L: 209
		int var2 = (var1.readUnsignedByte() & 255) + 1; // L: 210

		int var3;
		for (var3 = 0; var3 < class457.SpriteBuffer_spriteCount; ++var3) { // L: 211
			class267.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class457.SpriteBuffer_spriteCount; ++var3) { // L: 212
			class457.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class457.SpriteBuffer_spriteCount; ++var3) { // L: 213
			class457.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class457.SpriteBuffer_spriteCount; ++var3) { // L: 214
			Decimator.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
		}

		var1.offset = var0.length - 7 - class457.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3; // L: 215
		GrandExchangeOfferWorldComparator.SpriteBuffer_spritePalette = new int[var2]; // L: 216

		for (var3 = 1; var3 < var2; ++var3) { // L: 217
			GrandExchangeOfferWorldComparator.SpriteBuffer_spritePalette[var3] = var1.readMedium(); // L: 218
			if (GrandExchangeOfferWorldComparator.SpriteBuffer_spritePalette[var3] == 0) { // L: 219
				GrandExchangeOfferWorldComparator.SpriteBuffer_spritePalette[var3] = 1;
			}
		}

		var1.offset = 0; // L: 221

		for (var3 = 0; var3 < class457.SpriteBuffer_spriteCount; ++var3) { // L: 222
			int var4 = class457.SpriteBuffer_spriteWidths[var3]; // L: 223
			int var5 = Decimator.SpriteBuffer_spriteHeights[var3]; // L: 224
			int var6 = var4 * var5; // L: 225
			byte[] var7 = new byte[var6]; // L: 226
			class436.SpriteBuffer_pixels[var3] = var7; // L: 227
			int var8 = var1.readUnsignedByte(); // L: 228
			int var9;
			if (var8 == 0) { // L: 229
				for (var9 = 0; var9 < var6; ++var9) { // L: 230
					var7[var9] = var1.readByte();
				}
			} else if (var8 == 1) { // L: 232
				for (var9 = 0; var9 < var4; ++var9) { // L: 233
					for (int var10 = 0; var10 < var5; ++var10) { // L: 234
						var7[var9 + var10 * var4] = var1.readByte(); // L: 235
					}
				}
			}
		}

	} // L: 240

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ILbc;ZI)I",
		garbageValue = "1971750956"
	)
	static int method2188(int var0, Script var1, boolean var2) {
		if (var0 == 7400) { // L: 4685
			--TaskHandler.Interpreter_intStackSize; // L: 4686
			--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize; // L: 4687
			return 1; // L: 4688
		} else if (var0 == 7401) { // L: 4690
			--TaskHandler.Interpreter_intStackSize; // L: 4691
			--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize; // L: 4692
			return 1; // L: 4693
		} else if (var0 == 7402) { // L: 4695
			TaskHandler.Interpreter_intStackSize -= 2; // L: 4696
			--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize; // L: 4697
			return 1; // L: 4698
		} else if (var0 == 7403) { // L: 4700
			TaskHandler.Interpreter_intStackSize -= 2; // L: 4701
			--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize; // L: 4702
			return 1; // L: 4703
		} else if (var0 == 7404) { // L: 4705
			--TaskHandler.Interpreter_intStackSize; // L: 4706
			--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize; // L: 4707
			return 1; // L: 4708
		} else if (var0 == 7405) { // L: 4710
			TaskHandler.Interpreter_intStackSize -= 2; // L: 4711
			return 1; // L: 4712
		} else if (var0 == 7406) { // L: 4714
			--TaskHandler.Interpreter_intStackSize; // L: 4715
			Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = ""; // L: 4716
			return 1; // L: 4717
		} else if (var0 == 7407) { // L: 4719
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 4720
			return 1; // L: 4721
		} else if (var0 == 7408) { // L: 4723
			TaskHandler.Interpreter_intStackSize -= 2; // L: 4724
			--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize; // L: 4725
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 4726
			return 1; // L: 4727
		} else if (var0 == 7409) { // L: 4729
			--TaskHandler.Interpreter_intStackSize; // L: 4730
			return 1; // L: 4731
		} else if (var0 == 7463) { // L: 4733
			boolean var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1; // L: 4734
			method2183(var3); // L: 4735
			return 1; // L: 4736
		} else {
			return 2; // L: 4738
		}
	}

	@ObfuscatedName("mi")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "2729"
	)
	static void method2183(boolean var0) {
		Client.field604 = var0; // L: 12458
	} // L: 12459
}

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hd")
@Implements("FloorOverlayDefinition")
public class FloorOverlayDefinition extends DualNode {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	@Export("FloorOverlayDefinition_archive")
	public static AbstractArchive FloorOverlayDefinition_archive;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	@Export("FloorOverlayDefinition_cached")
	static EvictingDualNodeHashTable FloorOverlayDefinition_cached;
	@ObfuscatedName("ve")
	@ObfuscatedGetter(
		intValue = 57709805
	)
	static int field2194;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -35615287
	)
	@Export("primaryRgb")
	public int primaryRgb;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -2118857867
	)
	@Export("texture")
	public int texture;
	@ObfuscatedName("ab")
	@Export("hideUnderlay")
	public boolean hideUnderlay;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1500626921
	)
	@Export("secondaryRgb")
	public int secondaryRgb;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1648808253
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1001398063
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -2112714123
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -447286151
	)
	@Export("secondaryHue")
	public int secondaryHue;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1458718483
	)
	@Export("secondarySaturation")
	public int secondarySaturation;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -729708453
	)
	@Export("secondaryLightness")
	public int secondaryLightness;

	static {
		FloorOverlayDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	FloorOverlayDefinition() {
		this.primaryRgb = 0; // L: 12
		this.texture = -1; // L: 13
		this.hideUnderlay = true; // L: 14
		this.secondaryRgb = -1; // L: 15
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "563834011"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.secondaryRgb != -1) { // L: 37
			this.setHsl(this.secondaryRgb); // L: 38
			this.secondaryHue = this.hue; // L: 39
			this.secondarySaturation = this.saturation; // L: 40
			this.secondaryLightness = this.lightness; // L: 41
		}

		this.setHsl(this.primaryRgb); // L: 43
	} // L: 44

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Luj;II)V",
		garbageValue = "1543407873"
	)
	@Export("decode")
	void decode(Buffer var1, int var2) {
		while (true) {
			int var3 = var1.readUnsignedByte(); // L: 48
			if (var3 == 0) { // L: 49
				return; // L: 52
			}

			this.decodeNext(var1, var3, var2); // L: 50
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Luj;IIB)V",
		garbageValue = "2"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) { // L: 55
			this.primaryRgb = var1.readMedium();
		} else if (var2 == 2) {
			this.texture = var1.readUnsignedByte(); // L: 56
		} else if (var2 == 5) { // L: 57
			this.hideUnderlay = false;
		} else if (var2 == 7) {
			this.secondaryRgb = var1.readMedium(); // L: 58
		} else if (var2 == 8) { // L: 59
		}

	} // L: 61

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1030496121"
	)
	@Export("setHsl")
	void setHsl(int var1) {
		double var2 = (double)(var1 >> 16 & 255) / 256.0D; // L: 64
		double var4 = (double)(var1 >> 8 & 255) / 256.0D; // L: 65
		double var6 = (double)(var1 & 255) / 256.0D; // L: 66
		double var8 = var2; // L: 67
		if (var4 < var2) { // L: 68
			var8 = var4;
		}

		if (var6 < var8) { // L: 69
			var8 = var6;
		}

		double var10 = var2; // L: 70
		if (var4 > var2) { // L: 71
			var10 = var4;
		}

		if (var6 > var10) { // L: 72
			var10 = var6;
		}

		double var12 = 0.0D; // L: 73
		double var14 = 0.0D; // L: 74
		double var16 = (var10 + var8) / 2.0D; // L: 75
		if (var8 != var10) { // L: 76
			if (var16 < 0.5D) { // L: 77
				var14 = (var10 - var8) / (var10 + var8);
			}

			if (var16 >= 0.5D) { // L: 78
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var2 == var10) { // L: 79
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var10 == var4) { // L: 80
				var12 = (var6 - var2) / (var10 - var8) + 2.0D;
			} else if (var10 == var6) {
				var12 = (var2 - var4) / (var10 - var8) + 4.0D; // L: 81
			}
		}

		var12 /= 6.0D; // L: 83
		this.hue = (int)(256.0D * var12); // L: 84
		this.saturation = (int)(256.0D * var14); // L: 85
		this.lightness = (int)(256.0D * var16); // L: 86
		if (this.saturation < 0) { // L: 87
			this.saturation = 0;
		} else if (this.saturation > 255) { // L: 88
			this.saturation = 255;
		}

		if (this.lightness < 0) { // L: 89
			this.lightness = 0;
		} else if (this.lightness > 255) { // L: 90
			this.lightness = 255;
		}

	} // L: 91

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Lgv;",
		garbageValue = "202631143"
	)
	@Export("VarpDefinition_get")
	public static VarpDefinition VarpDefinition_get(int var0) {
		VarpDefinition var1 = (VarpDefinition)VarpDefinition.VarpDefinition_cached.get((long)var0); // L: 23
		if (var1 != null) { // L: 24
			return var1;
		} else {
			byte[] var2 = VarpDefinition.VarpDefinition_archive.takeFile(16, var0); // L: 25
			var1 = new VarpDefinition(); // L: 26
			if (var2 != null) { // L: 27
				var1.decode(new Buffer(var2));
			}

			VarpDefinition.VarpDefinition_cached.put(var1, (long)var0); // L: 28
			return var1; // L: 29
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;",
		garbageValue = "92814810"
	)
	@Export("loadClassFromDescriptor")
	static Class loadClassFromDescriptor(String var0) throws ClassNotFoundException {
		if (var0.equals("B")) { // L: 218
			return Byte.TYPE;
		} else if (var0.equals("I")) { // L: 219
			return Integer.TYPE;
		} else if (var0.equals("S")) { // L: 220
			return Short.TYPE;
		} else if (var0.equals("J")) { // L: 221
			return Long.TYPE;
		} else if (var0.equals("Z")) { // L: 222
			return Boolean.TYPE;
		} else if (var0.equals("F")) { // L: 223
			return Float.TYPE;
		} else if (var0.equals("D")) { // L: 224
			return Double.TYPE;
		} else if (var0.equals("C")) { // L: 225
			return Character.TYPE;
		} else {
			return var0.equals("void") ? Void.TYPE : Reflection.findClass(var0); // L: 226 227
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZB)I",
		garbageValue = "-19"
	)
	static int method4035(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 == ScriptOpcodes.IF_GETINVOBJECT) { // L: 1832
			var3 = HealthBarDefinition.field1877.method6285(Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]); // L: 1833
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var3.itemId; // L: 1834
			return 1; // L: 1835
		} else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) { // L: 1837
			var3 = HealthBarDefinition.field1877.method6285(Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]); // L: 1838
			if (var3.itemId != -1) { // L: 1839
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 1840
			}

			return 1; // L: 1841
		} else if (var0 == ScriptOpcodes.IF_HASSUB) { // L: 1843
			int var5 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 1844
			InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var5); // L: 1845
			if (var4 != null) { // L: 1846
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 1;
			} else {
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 1847
			}

			return 1; // L: 1848
		} else if (var0 == ScriptOpcodes.IF_GETTOP) { // L: 1850
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Client.rootInterface; // L: 1851
			return 1; // L: 1852
		} else if (var0 == 2707) { // L: 1854
			var3 = HealthBarDefinition.field1877.method6285(Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]); // L: 1855
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var3.method6682() ? 1 : 0; // L: 1856
			return 1; // L: 1857
		} else if (var0 == 2708) { // L: 1859
			var3 = HealthBarDefinition.field1877.method6285(Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]); // L: 1860
			return class310.method5938(var3); // L: 1861
		} else if (var0 == 2709) { // L: 1863
			var3 = HealthBarDefinition.field1877.method6285(Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]); // L: 1864
			return GrandExchangeOfferTotalQuantityComparator.method7080(var3); // L: 1865
		} else {
			return 2; // L: 1867
		}
	}

	@ObfuscatedName("lw")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;B)V",
		garbageValue = "8"
	)
	@Export("widgetDefaultMenuAction")
	static void widgetDefaultMenuAction(int var0, int var1, int var2, int var3, String var4) {
		Widget var5 = HealthBarDefinition.field1877.method6279(var1, var2); // L: 10244
		if (var5 != null) { // L: 10245
			if (var5.onOp != null) { // L: 10246
				ScriptEvent var6 = new ScriptEvent(); // L: 10247
				var6.widget = var5; // L: 10248
				var6.opIndex = var0; // L: 10249
				var6.targetName = var4; // L: 10250
				var6.args = var5.onOp; // L: 10251
				class157.runScriptEvent(var6); // L: 10252
			}

			boolean var8 = true; // L: 10254
			if (var5.contentType > 0) { // L: 10255
				var8 = class101.method2724(var5);
			}

			if (var8) { // L: 10256
				if (GraphicsObject.method2128(class361.getWidgetFlags(var5), var0 - 1)) { // L: 10257
					PacketBufferNode var7;
					if (var0 == 1) { // L: 10260
						var7 = class113.getPacketBufferNode(ClientPacket.field3201, Client.packetWriter.isaacCipher); // L: 10262
						var7.packetBuffer.writeInt(var1); // L: 10263
						var7.packetBuffer.writeShort(var2); // L: 10264
						var7.packetBuffer.writeShort(var3); // L: 10265
						Client.packetWriter.addNode(var7); // L: 10266
					}

					if (var0 == 2) { // L: 10268
						var7 = class113.getPacketBufferNode(ClientPacket.field3150, Client.packetWriter.isaacCipher); // L: 10270
						var7.packetBuffer.writeInt(var1); // L: 10271
						var7.packetBuffer.writeShort(var2); // L: 10272
						var7.packetBuffer.writeShort(var3); // L: 10273
						Client.packetWriter.addNode(var7); // L: 10274
					}

					if (var0 == 3) { // L: 10276
						var7 = class113.getPacketBufferNode(ClientPacket.field3207, Client.packetWriter.isaacCipher); // L: 10278
						var7.packetBuffer.writeInt(var1); // L: 10279
						var7.packetBuffer.writeShort(var2); // L: 10280
						var7.packetBuffer.writeShort(var3); // L: 10281
						Client.packetWriter.addNode(var7); // L: 10282
					}

					if (var0 == 4) { // L: 10284
						var7 = class113.getPacketBufferNode(ClientPacket.field3156, Client.packetWriter.isaacCipher); // L: 10286
						var7.packetBuffer.writeInt(var1); // L: 10287
						var7.packetBuffer.writeShort(var2); // L: 10288
						var7.packetBuffer.writeShort(var3); // L: 10289
						Client.packetWriter.addNode(var7); // L: 10290
					}

					if (var0 == 5) { // L: 10292
						var7 = class113.getPacketBufferNode(ClientPacket.field3145, Client.packetWriter.isaacCipher); // L: 10294
						var7.packetBuffer.writeInt(var1); // L: 10295
						var7.packetBuffer.writeShort(var2); // L: 10296
						var7.packetBuffer.writeShort(var3); // L: 10297
						Client.packetWriter.addNode(var7); // L: 10298
					}

					if (var0 == 6) { // L: 10300
						var7 = class113.getPacketBufferNode(ClientPacket.field3125, Client.packetWriter.isaacCipher); // L: 10302
						var7.packetBuffer.writeInt(var1); // L: 10303
						var7.packetBuffer.writeShort(var2); // L: 10304
						var7.packetBuffer.writeShort(var3); // L: 10305
						Client.packetWriter.addNode(var7); // L: 10306
					}

					if (var0 == 7) { // L: 10308
						var7 = class113.getPacketBufferNode(ClientPacket.field3140, Client.packetWriter.isaacCipher); // L: 10310
						var7.packetBuffer.writeInt(var1); // L: 10311
						var7.packetBuffer.writeShort(var2); // L: 10312
						var7.packetBuffer.writeShort(var3); // L: 10313
						Client.packetWriter.addNode(var7); // L: 10314
					}

					if (var0 == 8) { // L: 10316
						var7 = class113.getPacketBufferNode(ClientPacket.field3152, Client.packetWriter.isaacCipher); // L: 10318
						var7.packetBuffer.writeInt(var1); // L: 10319
						var7.packetBuffer.writeShort(var2); // L: 10320
						var7.packetBuffer.writeShort(var3); // L: 10321
						Client.packetWriter.addNode(var7); // L: 10322
					}

					if (var0 == 9) { // L: 10324
						var7 = class113.getPacketBufferNode(ClientPacket.field3159, Client.packetWriter.isaacCipher); // L: 10326
						var7.packetBuffer.writeInt(var1); // L: 10327
						var7.packetBuffer.writeShort(var2); // L: 10328
						var7.packetBuffer.writeShort(var3); // L: 10329
						Client.packetWriter.addNode(var7); // L: 10330
					}

					if (var0 == 10) { // L: 10332
						var7 = class113.getPacketBufferNode(ClientPacket.field3130, Client.packetWriter.isaacCipher); // L: 10334
						var7.packetBuffer.writeInt(var1); // L: 10335
						var7.packetBuffer.writeShort(var2); // L: 10336
						var7.packetBuffer.writeShort(var3); // L: 10337
						Client.packetWriter.addNode(var7); // L: 10338
					}

				}
			}
		}
	} // L: 10258 10340
}

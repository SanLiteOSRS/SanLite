import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jq")
@Implements("TextureProvider")
public class TextureProvider implements TextureLoader {
	@ObfuscatedName("nx")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	@Export("localPlayer")
	static Player localPlayer;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "[Ljo;"
	)
	@Export("textures")
	Texture[] textures;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	@Export("deque")
	NodeDeque deque;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1121483173
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 493105321
	)
	@Export("remaining")
	int remaining;
	@ObfuscatedName("ao")
	@Export("brightness")
	double brightness;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 2016217081
	)
	@Export("textureSize")
	int textureSize;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("archive")
	AbstractArchive archive;

	@ObfuscatedSignature(
		descriptor = "(Lom;Lom;IDI)V"
	)
	public TextureProvider(AbstractArchive var1, AbstractArchive var2, int var3, double var4, int var6) {
		this.deque = new NodeDeque(); // L: 9
		this.remaining = 0; // L: 11
		this.brightness = 1.0D; // L: 12
		this.textureSize = 128; // L: 13
		this.archive = var2; // L: 17
		this.capacity = var3; // L: 18
		this.remaining = this.capacity; // L: 19
		this.brightness = var4; // L: 20
		this.textureSize = var6; // L: 21
		int[] var7 = var1.getGroupFileIds(0); // L: 22
		if (var7 != null) { // L: 23
			int var8 = var7.length; // L: 24
			this.textures = new Texture[var1.getGroupFileCount(0)]; // L: 25

			for (int var9 = 0; var9 < var8; ++var9) { // L: 26
				Buffer var10 = new Buffer(var1.takeFile(0, var7[var9])); // L: 27
				this.textures[var7[var9]] = new Texture(var10); // L: 28
			}
		} else {
			this.textures = new Texture[0]; // L: 32
		}

	} // L: 34

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "56"
	)
	@Export("getLoadedPercentage")
	public int getLoadedPercentage() {
		if (this.textures.length == 0) { // L: 37
			return 100;
		} else {
			int var1 = 0; // L: 38
			int var2 = 0; // L: 39
			Texture[] var3 = this.textures; // L: 41

			for (int var4 = 0; var4 < var3.length; ++var4) { // L: 42
				Texture var5 = var3[var4]; // L: 43
				if (var5 != null && var5.fileIds != null) { // L: 45
					var1 += var5.fileIds.length; // L: 46
					int[] var6 = var5.fileIds; // L: 48

					for (int var7 = 0; var7 < var6.length; ++var7) { // L: 49
						int var8 = var6[var7]; // L: 50
						if (this.archive.method6944(var8)) { // L: 52
							++var2; // L: 53
						}
					}
				}
			}

			if (var1 == 0) { // L: 61
				return 0;
			} else {
				return var2 * 100 / var1; // L: 62
			}
		}
	}

	@ObfuscatedName("al")
	@Export("setBrightness")
	public void setBrightness(double var1) {
		this.brightness = var1; // L: 66
		this.clear(); // L: 67
	} // L: 68

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "-1910207818"
	)
	@Export("getTexturePixels")
	public int[] getTexturePixels(int var1) {
		Texture var2 = this.textures[var1]; // L: 71
		if (var2 != null) { // L: 72
			if (var2.pixels != null) { // L: 73
				this.deque.addLast(var2); // L: 74
				var2.isLoaded = true; // L: 75
				return var2.pixels; // L: 76
			}

			boolean var3 = var2.load(this.brightness, this.textureSize, this.archive); // L: 78
			if (var3) { // L: 79
				if (this.remaining == 0) { // L: 80
					Texture var4 = (Texture)this.deque.removeFirst(); // L: 81
					var4.reset(); // L: 82
				} else {
					--this.remaining; // L: 84
				}

				this.deque.addLast(var2); // L: 85
				var2.isLoaded = true; // L: 86
				return var2.pixels; // L: 87
			}
		}

		return null; // L: 90
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "958373665"
	)
	@Export("getAverageTextureRGB")
	public int getAverageTextureRGB(int var1) {
		return this.textures[var1] != null ? this.textures[var1].averageRGB : 0; // L: 94 95
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-20"
	)
	public boolean vmethod5182(int var1) {
		return this.textures[var1].field2501; // L: 99
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "21443457"
	)
	@Export("isLowDetail")
	public boolean isLowDetail(int var1) {
		return this.textureSize == 64; // L: 103
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1815480398"
	)
	@Export("clear")
	public void clear() {
		for (int var1 = 0; var1 < this.textures.length; ++var1) { // L: 107
			if (this.textures[var1] != null) { // L: 108
				this.textures[var1].reset();
			}
		}

		this.deque = new NodeDeque(); // L: 110
		this.remaining = this.capacity; // L: 111
	} // L: 112

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2088818432"
	)
	@Export("animate")
	public void animate(int var1) {
		for (int var2 = 0; var2 < this.textures.length; ++var2) { // L: 115
			Texture var3 = this.textures[var2]; // L: 116
			if (var3 != null && var3.animationDirection != 0 && var3.isLoaded) { // L: 117
				var3.animate(var1); // L: 118
				var3.isLoaded = false; // L: 119
			}
		}

	} // L: 122

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lom;IB)V",
		garbageValue = "32"
	)
	static void method4884(AbstractArchive var0, int var1) {
		if ((var1 & class525.field5124.rsOrdinal()) != 0) { // L: 280
			Login.logoSprite = class167.SpriteBuffer_getIndexedSpriteByName(var0, "logo_deadman_mode", ""); // L: 281
		} else if ((var1 & class525.field5125.rsOrdinal()) != 0) { // L: 283
			Login.logoSprite = class167.SpriteBuffer_getIndexedSpriteByName(var0, "logo_seasonal_mode", ""); // L: 284
		} else if ((var1 & class525.field5103.rsOrdinal()) != 0) { // L: 286
			Login.logoSprite = class167.SpriteBuffer_getIndexedSpriteByName(var0, "logo_speedrunning", ""); // L: 287
		} else {
			Login.logoSprite = class167.SpriteBuffer_getIndexedSpriteByName(var0, "logo", ""); // L: 290
		}

	} // L: 292

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-32"
	)
	static final void method4886() {
		if (!ViewportMouse.ViewportMouse_false0) { // L: 125
			int var0 = Scene.Scene_cameraPitchSine; // L: 126
			int var1 = Scene.Scene_cameraPitchCosine; // L: 127
			int var2 = Scene.Scene_cameraYawSine; // L: 128
			int var3 = Scene.Scene_cameraYawCosine; // L: 129
			byte var4 = 50; // L: 130
			short var5 = 3500; // L: 131
			int var6 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.method4567()) * var4 / Rasterizer3D.method4528(); // L: 132
			int var7 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.method4566()) * var4 / Rasterizer3D.method4528(); // L: 133
			int var8 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.method4567()) * var5 / Rasterizer3D.method4528(); // L: 134
			int var9 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.method4566()) * var5 / Rasterizer3D.method4528(); // L: 135
			int var10 = class10.method83(var7, var4, var1, var0); // L: 137
			int var13 = GrandExchangeOfferUnitPriceComparator.method7115(var7, var4, var1, var0); // L: 138
			var7 = var10; // L: 139
			var10 = class10.method83(var9, var5, var1, var0); // L: 140
			int var14 = GrandExchangeOfferUnitPriceComparator.method7115(var9, var5, var1, var0); // L: 141
			var9 = var10; // L: 142
			var10 = AbstractWorldMapData.method5648(var6, var13, var3, var2); // L: 143
			int var11 = var6 * var2 + var13 * var3 >> 16; // L: 146
			var6 = var10; // L: 149
			var10 = AbstractWorldMapData.method5648(var8, var14, var3, var2); // L: 150
			int var12 = var3 * var14 + var8 * var2 >> 16; // L: 153
			ViewportMouse.field2808 = (var6 + var10) / 2; // L: 157
			ViewportMouse.field2807 = (var9 + var7) / 2; // L: 158
			class286.field3074 = (var12 + var11) / 2; // L: 159
			class180.field1865 = (var10 - var6) / 2; // L: 160
			ViewportMouse.field2802 = (var9 - var7) / 2; // L: 161
			ViewportMouse.field2809 = (var12 - var11) / 2; // L: 162
			class190.field1914 = Math.abs(class180.field1865); // L: 163
			GraphicsObject.field890 = Math.abs(ViewportMouse.field2802); // L: 164
			HealthBar.field1312 = Math.abs(ViewportMouse.field2809); // L: 165
		}
	} // L: 166

	@ObfuscatedName("li")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;I)V",
		garbageValue = "-2147134009"
	)
	@Export("widgetDefaultMenuAction")
	static void widgetDefaultMenuAction(int var0, int var1, int var2, int var3, String var4) {
		Widget var5 = class33.field184.method6241(var1, var2); // L: 10187
		if (var5 != null) { // L: 10188
			if (var5.onOp != null) { // L: 10189
				ScriptEvent var6 = new ScriptEvent(); // L: 10190
				var6.widget = var5; // L: 10191
				var6.opIndex = var0; // L: 10192
				var6.targetName = var4; // L: 10193
				var6.args = var5.onOp; // L: 10194
				Interpreter.runScriptEvent(var6); // L: 10195
			}

			boolean var11 = true; // L: 10197
			if (var5.contentType > 0) { // L: 10198
				var11 = EnumComposition.method3761(var5);
			}

			if (var11) { // L: 10199
				int var8 = MouseRecorder.getWidgetFlags(var5); // L: 10201
				int var9 = var0 - 1; // L: 10202
				boolean var7 = (var8 >> var9 + 1 & 1) != 0; // L: 10204
				if (var7) { // L: 10206
					PacketBufferNode var10;
					if (var0 == 1) { // L: 10209
						var10 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3183, Client.packetWriter.isaacCipher); // L: 10211
						var10.packetBuffer.writeInt(var1); // L: 10212
						var10.packetBuffer.writeShort(var2); // L: 10213
						var10.packetBuffer.writeShort(var3); // L: 10214
						Client.packetWriter.addNode(var10); // L: 10215
					}

					if (var0 == 2) { // L: 10217
						var10 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3217, Client.packetWriter.isaacCipher); // L: 10219
						var10.packetBuffer.writeInt(var1); // L: 10220
						var10.packetBuffer.writeShort(var2); // L: 10221
						var10.packetBuffer.writeShort(var3); // L: 10222
						Client.packetWriter.addNode(var10); // L: 10223
					}

					if (var0 == 3) { // L: 10225
						var10 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3161, Client.packetWriter.isaacCipher); // L: 10227
						var10.packetBuffer.writeInt(var1); // L: 10228
						var10.packetBuffer.writeShort(var2); // L: 10229
						var10.packetBuffer.writeShort(var3); // L: 10230
						Client.packetWriter.addNode(var10); // L: 10231
					}

					if (var0 == 4) { // L: 10233
						var10 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3208, Client.packetWriter.isaacCipher); // L: 10235
						var10.packetBuffer.writeInt(var1); // L: 10236
						var10.packetBuffer.writeShort(var2); // L: 10237
						var10.packetBuffer.writeShort(var3); // L: 10238
						Client.packetWriter.addNode(var10); // L: 10239
					}

					if (var0 == 5) { // L: 10241
						var10 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3165, Client.packetWriter.isaacCipher); // L: 10243
						var10.packetBuffer.writeInt(var1); // L: 10244
						var10.packetBuffer.writeShort(var2); // L: 10245
						var10.packetBuffer.writeShort(var3); // L: 10246
						Client.packetWriter.addNode(var10); // L: 10247
					}

					if (var0 == 6) { // L: 10249
						var10 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3158, Client.packetWriter.isaacCipher); // L: 10251
						var10.packetBuffer.writeInt(var1); // L: 10252
						var10.packetBuffer.writeShort(var2); // L: 10253
						var10.packetBuffer.writeShort(var3); // L: 10254
						Client.packetWriter.addNode(var10); // L: 10255
					}

					if (var0 == 7) { // L: 10257
						var10 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3193, Client.packetWriter.isaacCipher); // L: 10259
						var10.packetBuffer.writeInt(var1); // L: 10260
						var10.packetBuffer.writeShort(var2); // L: 10261
						var10.packetBuffer.writeShort(var3); // L: 10262
						Client.packetWriter.addNode(var10); // L: 10263
					}

					if (var0 == 8) { // L: 10265
						var10 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3219, Client.packetWriter.isaacCipher); // L: 10267
						var10.packetBuffer.writeInt(var1); // L: 10268
						var10.packetBuffer.writeShort(var2); // L: 10269
						var10.packetBuffer.writeShort(var3); // L: 10270
						Client.packetWriter.addNode(var10); // L: 10271
					}

					if (var0 == 9) { // L: 10273
						var10 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3172, Client.packetWriter.isaacCipher); // L: 10275
						var10.packetBuffer.writeInt(var1); // L: 10276
						var10.packetBuffer.writeShort(var2); // L: 10277
						var10.packetBuffer.writeShort(var3); // L: 10278
						Client.packetWriter.addNode(var10); // L: 10279
					}

					if (var0 == 10) { // L: 10281
						var10 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3198, Client.packetWriter.isaacCipher); // L: 10283
						var10.packetBuffer.writeInt(var1); // L: 10284
						var10.packetBuffer.writeShort(var2); // L: 10285
						var10.packetBuffer.writeShort(var3); // L: 10286
						Client.packetWriter.addNode(var10); // L: 10287
					}

				}
			}
		}
	} // L: 10207 10289
}

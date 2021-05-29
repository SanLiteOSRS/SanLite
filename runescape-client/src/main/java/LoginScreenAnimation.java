import java.awt.Component;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ca")
@Implements("LoginScreenAnimation")
public class LoginScreenAnimation {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "[Lop;"
	)
	@Export("sprites")
	IndexedSprite[] sprites;
	@ObfuscatedName("r")
	int[] field1308;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1934818705
	)
	int field1309;
	@ObfuscatedName("d")
	int[] field1310;
	@ObfuscatedName("s")
	int[] field1311;
	@ObfuscatedName("u")
	int[] field1304;
	@ObfuscatedName("l")
	int[] field1315;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1784020073
	)
	int field1318;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -962717377
	)
	int field1313;
	@ObfuscatedName("e")
	int[] field1316;
	@ObfuscatedName("g")
	int[] field1317;
	@ObfuscatedName("a")
	int[] field1319;
	@ObfuscatedName("k")
	int[] field1312;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 348893403
	)
	int field1320;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1611807792
	)
	int field1321;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -453028953
	)
	int field1322;

	@ObfuscatedSignature(
		descriptor = "([Lop;)V"
	)
	LoginScreenAnimation(IndexedSprite[] var1) {
		this.field1308 = new int[256];
		this.field1309 = 0;
		this.field1318 = 0;
		this.field1313 = 0;
		this.field1320 = 0;
		this.field1321 = 0;
		this.field1322 = 0;
		this.sprites = var1;
		this.initColors();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "41"
	)
	@Export("initColors")
	void initColors() {
		this.field1311 = new int[256];

		int var1;
		for (var1 = 0; var1 < 64; ++var1) {
			this.field1311[var1] = var1 * 262144;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1311[var1 + 64] = var1 * 1024 + 16711680;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1311[var1 + 128] = var1 * 4 + 16776960;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1311[var1 + 192] = 16777215;
		}

		this.field1304 = new int[256];

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1304[var1] = var1 * 1024;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1304[var1 + 64] = var1 * 4 + 65280;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1304[var1 + 128] = var1 * 262144 + 65535;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1304[var1 + 192] = 16777215;
		}

		this.field1315 = new int[256];

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1315[var1] = var1 * 4;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1315[var1 + 64] = var1 * 262144 + 255;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1315[var1 + 128] = var1 * 1024 + 16711935;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1315[var1 + 192] = 16777215;
		}

		this.field1310 = new int[256];
		this.field1320 = 0;
		this.field1319 = new int[32768];
		this.field1312 = new int[32768];
		this.method2232((IndexedSprite)null);
		this.field1316 = new int[32768];
		this.field1317 = new int[32768];
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "7298"
	)
	void method2202() {
		this.field1311 = null;
		this.field1304 = null;
		this.field1315 = null;
		this.field1310 = null;
		this.field1319 = null;
		this.field1312 = null;
		this.field1316 = null;
		this.field1317 = null;
		this.field1320 = 0;
		this.field1321 = 0;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2082612852"
	)
	@Export("draw")
	void draw(int var1, int var2) {
		if (this.field1316 == null) {
			this.initColors();
		}

		if (this.field1322 == 0) {
			this.field1322 = var2;
		}

		int var3 = var2 - this.field1322;
		if (var3 >= 256) {
			var3 = 0;
		}

		this.field1322 = var2;
		if (var3 > 0) {
			this.method2204(var3);
		}

		this.method2206(var1);
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "12943"
	)
	final void method2204(int var1) {
		this.field1320 += 128 * var1;
		int var2;
		if (this.field1320 > this.field1319.length) {
			this.field1320 -= this.field1319.length;
			var2 = (int)(Math.random() * 12.0D);
			this.method2232(this.sprites[var2]);
		}

		var2 = 0;
		int var3 = var1 * 128;
		int var4 = (256 - var1) * 128;

		int var6;
		for (int var5 = 0; var5 < var4; ++var5) {
			var6 = this.field1316[var2 + var3] - this.field1319[var2 + this.field1320 & this.field1319.length - 1] * var1 / 6;
			if (var6 < 0) {
				var6 = 0;
			}

			this.field1316[var2++] = var6;
		}

		byte var15 = 10;
		var6 = 128 - var15;

		int var7;
		int var10;
		for (var7 = 256 - var1; var7 < 256; ++var7) {
			int var8 = var7 * 128;

			for (int var9 = 0; var9 < 128; ++var9) {
				var10 = (int)(Math.random() * 100.0D);
				if (var10 < 50 && var9 > var15 && var9 < var6) {
					this.field1316[var8 + var9] = 255;
				} else {
					this.field1316[var9 + var8] = 0;
				}
			}
		}

		if (this.field1318 * 16 > 0) {
			this.field1318 = this.field1318 * 16 - var1 * 4;
		}

		if (this.field1313 * 16 > 0) {
			this.field1313 = this.field1313 * 16 - var1 * 4;
		}

		if (this.field1318 * 16 == 0 && this.field1313 * 16 == 0) {
			var7 = (int)(Math.random() * (double)(2000 / var1));
			if (var7 == 0) {
				this.field1318 = 1024;
			}

			if (var7 == 1) {
				this.field1313 = 1024;
			}
		}

		for (var7 = 0; var7 < 256 - var1; ++var7) {
			this.field1308[var7] = this.field1308[var7 + var1];
		}

		for (var7 = 256 - var1; var7 < 256; ++var7) {
			this.field1308[var7] = (int)(Math.sin((double)this.field1309 / 14.0D) * 16.0D + Math.sin((double)this.field1309 / 15.0D) * 14.0D + Math.sin((double)this.field1309 / 16.0D) * 12.0D);
			++this.field1309;
		}

		this.field1321 = this.field1321 * 10000 + 10000 * var1;
		var7 = ((Client.cycle & 1) + var1) / 2;
		if (var7 > 0) {
			short var16 = 128;
			byte var17 = 2;
			var10 = 128 - var17 - var17;

			int var11;
			int var12;
			int var13;
			for (var11 = 0; var11 < this.field1321 * 100; ++var11) {
				var12 = (int)(Math.random() * (double)var10) + var17;
				var13 = (int)(Math.random() * (double)var16) + var16;
				this.field1316[var12 + (var13 << 7)] = 192;
			}

			this.field1321 = 0;

			int var14;
			for (var11 = 0; var11 < 256; ++var11) {
				var12 = 0;
				var13 = var11 * 128;

				for (var14 = -var7; var14 < 128; ++var14) {
					if (var14 + var7 < 128) {
						var12 += this.field1316[var7 + var13 + var14];
					}

					if (var14 - (var7 + 1) >= 0) {
						var12 -= this.field1316[var13 + var14 - (var7 + 1)];
					}

					if (var14 >= 0) {
						this.field1317[var13 + var14] = var12 / (var7 * 2 + 1);
					}
				}
			}

			for (var11 = 0; var11 < 128; ++var11) {
				var12 = 0;

				for (var13 = -var7; var13 < 256; ++var13) {
					var14 = var13 * 128;
					if (var7 + var13 < 256) {
						var12 += this.field1317[var7 * 128 + var14 + var11];
					}

					if (var13 - (var7 + 1) >= 0) {
						var12 -= this.field1317[var11 + var14 - (var7 + 1) * 128];
					}

					if (var13 >= 0) {
						this.field1316[var14 + var11] = var12 / (var7 * 2 + 1);
					}
				}
			}
		}

	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "-67"
	)
	final int method2205(int var1, int var2, int var3) {
		int var4 = 256 - var3;
		return (var3 * (var2 & 65280) + var4 * (var1 & 65280) & 16711680) + (var3 * (var2 & 16711935) + var4 * (var1 & 16711935) & -16711936) >> 8;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2071342179"
	)
	final void method2206(int var1) {
		int var2 = this.field1310.length;
		if (this.field1318 * 16 > 0) {
			this.method2201(this.field1318 * 16, this.field1304);
		} else if (this.field1313 * 16 > 0) {
			this.method2201(this.field1313 * 16, this.field1315);
		} else {
			for (int var3 = 0; var3 < var2; ++var3) {
				this.field1310[var3] = this.field1311[var3];
			}
		}

		this.method2208(var1);
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I[II)V",
		garbageValue = "889214650"
	)
	final void method2201(int var1, int[] var2) {
		int var3 = this.field1310.length;

		for (int var4 = 0; var4 < var3; ++var4) {
			if (var1 > 768) {
				this.field1310[var4] = this.method2205(this.field1311[var4], var2[var4], 1024 - var1);
			} else if (var1 > 256) {
				this.field1310[var4] = var2[var4];
			} else {
				this.field1310[var4] = this.method2205(var2[var4], this.field1311[var4], 256 - var1);
			}
		}

	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "366284227"
	)
	final void method2208(int var1) {
		int var2 = 0;

		for (int var3 = 1; var3 < 255; ++var3) {
			int var4 = (256 - var3) * this.field1308[var3] / 256;
			int var5 = var4 + var1;
			int var6 = 0;
			int var7 = 128;
			if (var5 < 0) {
				var6 = -var5;
				var5 = 0;
			}

			if (var5 + 128 >= class26.rasterProvider.width) {
				var7 = class26.rasterProvider.width - var5;
			}

			int var8 = var5 + (var3 + 8) * class26.rasterProvider.width;
			var2 += var6;

			for (int var9 = var6; var9 < var7; ++var9) {
				int var10 = this.field1316[var2++];
				int var11 = var8 % Rasterizer2D.Rasterizer2D_width;
				if (var10 != 0 && var11 >= Rasterizer2D.Rasterizer2D_xClipStart && var11 < Rasterizer2D.Rasterizer2D_xClipEnd) {
					int var12 = var10;
					int var13 = 256 - var10;
					var10 = this.field1310[var10];
					int var14 = class26.rasterProvider.pixels[var8];
					class26.rasterProvider.pixels[var8++] = -16777216 | ((var14 & 16711935) * var13 + (var10 & 16711935) * var12 & -16711936) + (var12 * (var10 & 65280) + var13 * (var14 & 65280) & 16711680) >> 8;
				} else {
					++var8;
				}
			}

			var2 += 128 - var7;
		}

	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lop;B)V",
		garbageValue = "-54"
	)
	final void method2232(IndexedSprite var1) {
		int var2;
		for (var2 = 0; var2 < this.field1319.length; ++var2) {
			this.field1319[var2] = 0;
		}

		int var3;
		for (var2 = 0; var2 < 5000; ++var2) {
			var3 = (int)(Math.random() * 128.0D * 256.0D);
			this.field1319[var3] = (int)(Math.random() * 256.0D);
		}

		int var4;
		int var5;
		for (var2 = 0; var2 < 20; ++var2) {
			for (var3 = 1; var3 < 255; ++var3) {
				for (var4 = 1; var4 < 127; ++var4) {
					var5 = var4 + (var3 << 7);
					this.field1312[var5] = (this.field1319[var5 + 128] + this.field1319[var5 - 128] + this.field1319[var5 + 1] + this.field1319[var5 - 1]) / 4;
				}
			}

			int[] var8 = this.field1319;
			this.field1319 = this.field1312;
			this.field1312 = var8;
		}

		if (var1 != null) {
			var2 = 0;

			for (var3 = 0; var3 < var1.subHeight; ++var3) {
				for (var4 = 0; var4 < var1.subWidth; ++var4) {
					if (var1.pixels[var2++] != 0) {
						var5 = var4 + var1.xOffset + 16;
						int var6 = var3 + var1.yOffset + 16;
						int var7 = var5 + (var6 << 7);
						this.field1319[var7] = 0;
					}
				}
			}
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Lfl;",
		garbageValue = "-77736406"
	)
	@Export("SequenceDefinition_get")
	public static SequenceDefinition SequenceDefinition_get(int var0) {
		SequenceDefinition var1 = (SequenceDefinition)SequenceDefinition.SequenceDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = SequenceDefinition.SequenceDefinition_archive.takeFile(12, var0);
			var1 = new SequenceDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			SequenceDefinition.SequenceDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljv;I)V",
		garbageValue = "1926363806"
	)
	public static void method2210(AbstractArchive var0) {
		InvDefinition.InvDefinition_archive = var0;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "-1738532871"
	)
	static void method2236(Component var0) {
		var0.setFocusTraversalKeysEnabled(false);
		var0.addKeyListener(KeyHandler.KeyHandler_instance);
		var0.addFocusListener(KeyHandler.KeyHandler_instance);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljv;IIIZI)V",
		garbageValue = "1103817184"
	)
	public static void method2219(AbstractArchive var0, int var1, int var2, int var3, boolean var4) {
		class232.musicPlayerStatus = 1;
		ModelData0.musicTrackArchive = var0;
		class32.musicTrackGroupId = var1;
		class18.musicTrackFileId = var2;
		class232.musicTrackVolume = var3;
		class232.musicTrackBoolean = var4;
		class232.pcmSampleLength = 10000;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-2048658082"
	)
	static int method2235(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return 0;
		} else if (var1 == -1) {
			return 0;
		} else {
			int var3 = 0;

			for (int var4 = 0; var4 < var2.quantities.length; ++var4) {
				if (var2.ids[var4] == var1) {
					var3 += var2.quantities[var4];
				}
			}

			return var3;
		}
	}

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-2141700582"
	)
	@Export("selectSpell")
	static void selectSpell(int var0, int var1, int var2, int var3) {
		Widget var4 = ModeWhere.getWidgetChild(var0, var1);
		if (var4 != null && var4.onTargetEnter != null) {
			ScriptEvent var5 = new ScriptEvent();
			var5.widget = var4;
			var5.args = var4.onTargetEnter;
			PacketWriter.runScriptEvent(var5);
		}

		Client.field788 = var3;
		Client.isSpellSelected = true;
		Decimator.selectedSpellWidget = var0;
		Client.selectedSpellChildIndex = var1;
		class4.selectedSpellFlags = var2;
		WorldMapCacheName.invalidateWidget(var4);
	}
}

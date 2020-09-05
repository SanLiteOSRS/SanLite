import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cn")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Lji;"
	)
	@Export("objectSounds")
	static NodeDeque objectSounds;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -709307059
	)
	int field1106;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 397681607
	)
	int field1109;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -2039655179
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1872508032
	)
	@Export("x")
	int x;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -332128128
	)
	@Export("y")
	int y;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 630355584
	)
	int field1117;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 159221067
	)
	int field1108;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -34287423
	)
	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Ldm;"
	)
	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -793765363
	)
	int field1115;
	@ObfuscatedName("d")
	@Export("soundEffectIds")
	int[] soundEffectIds;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1493720003
	)
	int field1118;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "Ldm;"
	)
	@Export("stream2")
	RawPcmStream stream2;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Ljg;"
	)
	@Export("obj")
	ObjectComposition obj;

	static {
		objectSounds = new NodeDeque();
	}

	ObjectSound() {
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(S)V",
		garbageValue = "23141"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId;
		ObjectComposition var2 = this.obj.transform();
		if (var2 != null) {
			this.soundEffectId = var2.ambientSoundId;
			this.field1108 = var2.int4 * 128;
			this.field1109 = var2.int5;
			this.field1115 = var2.int6;
			this.soundEffectIds = var2.soundEffectIds;
		} else {
			this.soundEffectId = -1;
			this.field1108 = 0;
			this.field1109 = 0;
			this.field1115 = 0;
			this.soundEffectIds = null;
		}

		if (var1 != this.soundEffectId && this.stream1 != null) {
			Players.pcmStreamMixer.removeSubStream(this.stream1);
			this.stream1 = null;
		}

	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(IIILgk;Lft;Z[I[II)I",
		garbageValue = "585346810"
	)
	public static int method1986(int var0, int var1, int var2, RouteStrategy var3, CollisionMap var4, boolean var5, int[] var6, int[] var7) {
		int var9;
		for (int var8 = 0; var8 < 128; ++var8) {
			for (var9 = 0; var9 < 128; ++var9) {
				class182.directions[var8][var9] = 0;
				class182.distances[var8][var9] = 99999999;
			}
		}

		boolean var27;
		if (var2 == 1) {
			var27 = ObjectComposition.method4747(var0, var1, var3, var4);
		} else if (var2 == 2) {
			var27 = class41.method619(var0, var1, var3, var4);
		} else {
			var27 = FriendSystem.method1976(var0, var1, var2, var3, var4);
		}

		var9 = var0 - 64;
		int var10 = var1 - 64;
		int var11 = class182.field2135;
		int var12 = class182.field2136;
		int var13;
		int var14;
		int var16;
		if (!var27) {
			var13 = Integer.MAX_VALUE;
			var14 = Integer.MAX_VALUE;
			byte var15 = 10;
			var16 = var3.approxDestinationX;
			int var17 = var3.approxDestinationY;
			int var18 = var3.approxDestinationSizeX;
			int var19 = var3.approxDestinationSizeY;

			for (int var20 = var16 - var15; var20 <= var15 + var16; ++var20) {
				for (int var21 = var17 - var15; var21 <= var17 + var15; ++var21) {
					int var22 = var20 - var9;
					int var23 = var21 - var10;
					if (var22 >= 0 && var23 >= 0 && var22 < 128 && var23 < 128 && class182.distances[var22][var23] < 100) {
						int var24 = 0;
						if (var20 < var16) {
							var24 = var16 - var20;
						} else if (var20 > var16 + var18 - 1) {
							var24 = var20 - (var18 + var16 - 1);
						}

						int var25 = 0;
						if (var21 < var17) {
							var25 = var17 - var21;
						} else if (var21 > var17 + var19 - 1) {
							var25 = var21 - (var17 + var19 - 1);
						}

						int var26 = var25 * var25 + var24 * var24;
						if (var26 < var13 || var26 == var13 && class182.distances[var22][var23] < var14) {
							var13 = var26;
							var14 = class182.distances[var22][var23];
							var11 = var20;
							var12 = var21;
						}
					}
				}
			}

			if (var13 == Integer.MAX_VALUE) {
				return -1;
			}
		}

		if (var0 == var11 && var12 == var1) {
			return 0;
		} else {
			byte var28 = 0;
			class182.bufferX[var28] = var11;
			var13 = var28 + 1;
			class182.bufferY[var28] = var12;

			int var29;
			for (var14 = var29 = class182.directions[var11 - var9][var12 - var10]; var0 != var11 || var12 != var1; var14 = class182.directions[var11 - var9][var12 - var10]) {
				if (var14 != var29) {
					var29 = var14;
					class182.bufferX[var13] = var11;
					class182.bufferY[var13++] = var12;
				}

				if ((var14 & 2) != 0) {
					++var11;
				} else if ((var14 & 8) != 0) {
					--var11;
				}

				if ((var14 & 1) != 0) {
					++var12;
				} else if ((var14 & 4) != 0) {
					--var12;
				}
			}

			var16 = 0;

			while (var13-- > 0) {
				var6[var16] = class182.bufferX[var13];
				var7[var16++] = class182.bufferY[var13];
				if (var16 >= var6.length) {
					break;
				}
			}

			return var16;
		}
	}

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		signature = "(IIIIIIB)V",
		garbageValue = "-62"
	)
	static final void method1987(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var2 - var0;
		int var7 = var3 - var1;
		int var8 = var6 >= 0 ? var6 : -var6;
		int var9 = var7 >= 0 ? var7 : -var7;
		int var10 = var8;
		if (var8 < var9) {
			var10 = var9;
		}

		if (var10 != 0) {
			int var11 = (var6 << 16) / var10;
			int var12 = (var7 << 16) / var10;
			if (var12 <= var11) {
				var11 = -var11;
			} else {
				var12 = -var12;
			}

			int var13 = var5 * var12 >> 17;
			int var14 = var5 * var12 + 1 >> 17;
			int var15 = var5 * var11 >> 17;
			int var16 = var5 * var11 + 1 >> 17;
			var0 -= Rasterizer2D.Rasterizer2D_xClipStart;
			var1 -= Rasterizer2D.Rasterizer2D_yClipStart;
			int var17 = var0 + var13;
			int var18 = var0 - var14;
			int var19 = var0 + var6 - var14;
			int var20 = var0 + var13 + var6;
			int var21 = var15 + var1;
			int var22 = var1 - var16;
			int var23 = var7 + var1 - var16;
			int var24 = var15 + var7 + var1;
			Rasterizer3D.method3120(var17, var18, var19);
			Rasterizer3D.method3172(var21, var22, var23, var17, var18, var19, var4);
			Rasterizer3D.method3120(var17, var19, var20);
			Rasterizer3D.method3172(var21, var23, var24, var17, var19, var20, var4);
		}
	}

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-457226799"
	)
	static void method1983(int var0) {
		TaskHandler.tempMenuAction = new MenuAction();
		TaskHandler.tempMenuAction.param0 = Client.menuArguments1[var0];
		TaskHandler.tempMenuAction.param1 = Client.menuArguments2[var0];
		TaskHandler.tempMenuAction.opcode = Client.menuOpcodes[var0];
		TaskHandler.tempMenuAction.identifier = Client.menuIdentifiers[var0];
		TaskHandler.tempMenuAction.action = Client.menuActions[var0];
	}
}

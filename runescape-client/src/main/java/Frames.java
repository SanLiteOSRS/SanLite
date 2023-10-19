import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ja")
@Implements("Frames")
public class Frames extends DualNode {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "[Lji;"
	)
	@Export("frames")
	Animation[] frames;

	@ObfuscatedSignature(
		descriptor = "(Lom;Lom;IZ)V"
	)
	Frames(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		NodeDeque var5 = new NodeDeque(); // L: 35
		int var6 = var1.getGroupFileCount(var3); // L: 36
		this.frames = new Animation[var6]; // L: 37
		int[] var7 = var1.getGroupFileIds(var3); // L: 38

		for (int var8 = 0; var8 < var7.length; ++var8) { // L: 39
			byte[] var9 = var1.takeFile(var3, var7[var8]); // L: 40
			Skeleton var10 = null; // L: 41
			int var11 = (var9[0] & 255) << 8 | var9[1] & 255; // L: 42

			for (Skeleton var12 = (Skeleton)var5.last(); var12 != null; var12 = (Skeleton)var5.previous()) { // L: 43 44 49
				if (var11 == var12.id) { // L: 45
					var10 = var12; // L: 46
					break;
				}
			}

			if (var10 == null) { // L: 51
				byte[] var13;
				if (var4) { // L: 53
					var13 = var2.getFile(0, var11);
				} else {
					var13 = var2.getFile(var11, 0); // L: 54
				}

				var10 = new Skeleton(var11, var13); // L: 55
				var5.addFirst(var10); // L: 56
			}

			this.frames[var7[var8]] = new Animation(var9, var10); // L: 58
		}

	} // L: 60

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1567177600"
	)
	@Export("hasAlphaTransform")
	public boolean hasAlphaTransform(int var1) {
		return this.frames[var1].hasAlphaTransform; // L: 63
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([BI)Lud;",
		garbageValue = "-1476934708"
	)
	public static final SpritePixels method4854(byte[] var0) {
		BufferedImage var1 = null; // L: 20

		try {
			Class var2 = ImageIO.class; // L: 22
			synchronized(ImageIO.class) {
				var1 = ImageIO.read(new ByteArrayInputStream(var0)); // L: 23
			} // L: 24

			int var6 = var1.getWidth(); // L: 25
			int var7 = var1.getHeight(); // L: 26
			int[] var4 = new int[var6 * var7]; // L: 27
			PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var6, var7, var4, 0, var6); // L: 28
			var5.grabPixels(); // L: 29
			return new SpritePixels(var4, var6, var7); // L: 30
		} catch (IOException var9) { // L: 32
		} catch (InterruptedException var10) { // L: 33
		}

		return new SpritePixels(0, 0); // L: 34
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([FIFI)F",
		garbageValue = "-2051781010"
	)
	static float method4846(float[] var0, int var1, float var2) {
		float var3 = var0[var1]; // L: 200

		for (int var4 = var1 - 1; var4 >= 0; --var4) { // L: 201
			var3 = var2 * var3 + var0[var4]; // L: 202
		}

		return var3; // L: 204
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "([I[IIIB)V",
		garbageValue = "-27"
	)
	public static void method4849(int[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) { // L: 73
			int var4 = (var3 + var2) / 2; // L: 74
			int var5 = var2; // L: 75
			int var6 = var0[var4]; // L: 76
			var0[var4] = var0[var3]; // L: 77
			var0[var3] = var6; // L: 78
			int var7 = var1[var4]; // L: 79
			var1[var4] = var1[var3]; // L: 80
			var1[var3] = var7; // L: 81
			int var8 = var6 == Integer.MAX_VALUE ? 0 : 1; // L: 82

			for (int var9 = var2; var9 < var3; ++var9) { // L: 83
				if (var0[var9] < (var9 & var8) + var6) { // L: 84
					int var10 = var0[var9]; // L: 85
					var0[var9] = var0[var5]; // L: 86
					var0[var5] = var10; // L: 87
					int var11 = var1[var9]; // L: 88
					var1[var9] = var1[var5]; // L: 89
					var1[var5++] = var11; // L: 90
				}
			}

			var0[var3] = var0[var5]; // L: 94
			var0[var5] = var6; // L: 95
			var1[var3] = var1[var5]; // L: 96
			var1[var5] = var7; // L: 97
			method4849(var0, var1, var2, var5 - 1); // L: 98
			method4849(var0, var1, var5 + 1, var3); // L: 99
		}

	} // L: 101

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ILds;ZI)I",
		garbageValue = "-1515461469"
	)
	static int method4856(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTCLOCK) { // L: 2674
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.cycle; // L: 2675
			return 1; // L: 2676
		} else {
			int var3;
			int var4;
			if (var0 == ScriptOpcodes.INV_GETOBJ) { // L: 2678
				Interpreter.Interpreter_intStackSize -= 2; // L: 2679
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2680
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2681
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Language.method7161(var3, var4); // L: 2682
				return 1; // L: 2683
			} else if (var0 == ScriptOpcodes.INV_GETNUM) { // L: 2685
				Interpreter.Interpreter_intStackSize -= 2; // L: 2686
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2687
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2688
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class27.ItemContainer_getCount(var3, var4); // L: 2689
				return 1; // L: 2690
			} else if (var0 == ScriptOpcodes.INV_TOTAL) { // L: 2692
				Interpreter.Interpreter_intStackSize -= 2; // L: 2693
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2694
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2695
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ClanSettings.method3308(var3, var4); // L: 2696
				return 1; // L: 2697
			} else if (var0 == ScriptOpcodes.INV_SIZE) { // L: 2699
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2700
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ClanChannel.getInvDefinition(var3).size; // L: 2701
				return 1; // L: 2702
			} else if (var0 == ScriptOpcodes.STAT) { // L: 2704
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2705
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.currentLevels[var3]; // L: 2706
				return 1; // L: 2707
			} else if (var0 == ScriptOpcodes.STAT_BASE) { // L: 2709
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2710
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.levels[var3]; // L: 2711
				return 1; // L: 2712
			} else if (var0 == ScriptOpcodes.STAT_XP) { // L: 2714
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2715
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.experience[var3]; // L: 2716
				return 1; // L: 2717
			} else {
				int var5;
				if (var0 == ScriptOpcodes.COORD) { // L: 2719
					var3 = class87.Client_plane; // L: 2720
					var4 = class20.baseX * 64 + (TextureProvider.localPlayer.x >> 7); // L: 2721
					var5 = class19.baseY * 64 + (TextureProvider.localPlayer.y >> 7); // L: 2722
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (var4 << 14) + var5 + (var3 << 28); // L: 2723
					return 1; // L: 2724
				} else if (var0 == ScriptOpcodes.COORDX) { // L: 2726
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2727
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 >> 14 & 16383; // L: 2728
					return 1; // L: 2729
				} else if (var0 == ScriptOpcodes.COORDZ) { // L: 2731
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2732
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 >> 28; // L: 2733
					return 1; // L: 2734
				} else if (var0 == ScriptOpcodes.COORDY) { // L: 2736
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2737
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 & 16383; // L: 2738
					return 1; // L: 2739
				} else if (var0 == ScriptOpcodes.MAP_MEMBERS) { // L: 2741
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0; // L: 2742
					return 1; // L: 2743
				} else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) { // L: 2745
					Interpreter.Interpreter_intStackSize -= 2; // L: 2746
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] + 32768; // L: 2747
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2748
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Language.method7161(var3, var4); // L: 2749
					return 1; // L: 2750
				} else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) { // L: 2752
					Interpreter.Interpreter_intStackSize -= 2; // L: 2753
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] + 32768; // L: 2754
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2755
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class27.ItemContainer_getCount(var3, var4); // L: 2756
					return 1; // L: 2757
				} else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) { // L: 2759
					Interpreter.Interpreter_intStackSize -= 2; // L: 2760
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] + 32768; // L: 2761
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2762
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ClanSettings.method3308(var3, var4); // L: 2763
					return 1; // L: 2764
				} else if (var0 == ScriptOpcodes.STAFFMODLEVEL) { // L: 2766
					if (Client.staffModLevel >= 2) { // L: 2767
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.staffModLevel;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2768
					}

					return 1; // L: 2769
				} else if (var0 == ScriptOpcodes.REBOOTTIMER) { // L: 2771
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.rebootTimer; // L: 2772
					return 1; // L: 2773
				} else if (var0 == ScriptOpcodes.MAP_WORLD) { // L: 2775
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.worldId; // L: 2776
					return 1; // L: 2777
				} else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) { // L: 2779
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field695 / 100; // L: 2780
					return 1; // L: 2781
				} else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) { // L: 2783
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.weight; // L: 2784
					return 1; // L: 2785
				} else if (var0 == ScriptOpcodes.PLAYERMOD) { // L: 2787
					if (Client.playerMod) { // L: 2788
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2789
					}

					return 1; // L: 2790
				} else if (var0 == ScriptOpcodes.WORLDFLAGS) { // L: 2792
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.worldProperties; // L: 2793
					return 1; // L: 2794
				} else if (var0 == ScriptOpcodes.MOVECOORD) { // L: 2796
					Interpreter.Interpreter_intStackSize -= 4; // L: 2797
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2798
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2799
					var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 2800
					int var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 2801
					var3 += var4 << 14; // L: 2802
					var3 += var5 << 28; // L: 2803
					var3 += var6; // L: 2804
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3; // L: 2805
					return 1; // L: 2806
				} else if (var0 == 3326) { // L: 2808
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field652; // L: 2809
					return 1; // L: 2810
				} else if (var0 == 3327) { // L: 2812
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field597; // L: 2813
					return 1; // L: 2814
				} else if (var0 == 3331) { // L: 2816
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field695; // L: 2817
					return 1; // L: 2818
				} else {
					return 2; // L: 2820
				}
			}
		}
	}
}

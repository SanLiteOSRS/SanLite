import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bp")
@Implements("VorbisFloor")
public class VorbisFloor {
	@ObfuscatedName("aq")
	static final int[] field276;
	@ObfuscatedName("aw")
	@Export("VorbisFloor_decibelStatics")
	static final float[] VorbisFloor_decibelStatics;
	@ObfuscatedName("al")
	int[] field274;
	@ObfuscatedName("ai")
	@Export("multiplier")
	int multiplier;
	@ObfuscatedName("ar")
	int[] field272;
	@ObfuscatedName("as")
	int[] field275;
	@ObfuscatedName("aa")
	int[] field277;
	@ObfuscatedName("az")
	int[] field270;
	@ObfuscatedName("ao")
	int[][] field278;

	static {
		field276 = new int[]{256, 128, 86, 64}; // L: 8
		VorbisFloor_decibelStatics = new float[]{1.0649863E-7F, 1.1341951E-7F, 1.2079015E-7F, 1.2863978E-7F, 1.369995E-7F, 1.459025E-7F, 1.5538409E-7F, 1.6548181E-7F, 1.7623574E-7F, 1.8768856E-7F, 1.998856E-7F, 2.128753E-7F, 2.2670913E-7F, 2.4144197E-7F, 2.5713223E-7F, 2.7384212E-7F, 2.9163792E-7F, 3.1059022E-7F, 3.307741E-7F, 3.5226967E-7F, 3.7516213E-7F, 3.995423E-7F, 4.255068E-7F, 4.5315863E-7F, 4.8260745E-7F, 5.1397E-7F, 5.4737063E-7F, 5.829419E-7F, 6.208247E-7F, 6.611694E-7F, 7.041359E-7F, 7.4989464E-7F, 7.98627E-7F, 8.505263E-7F, 9.057983E-7F, 9.646621E-7F, 1.0273513E-6F, 1.0941144E-6F, 1.1652161E-6F, 1.2409384E-6F, 1.3215816E-6F, 1.4074654E-6F, 1.4989305E-6F, 1.5963394E-6F, 1.7000785E-6F, 1.8105592E-6F, 1.9282195E-6F, 2.053526E-6F, 2.1869757E-6F, 2.3290977E-6F, 2.4804558E-6F, 2.6416496E-6F, 2.813319E-6F, 2.9961443E-6F, 3.1908505E-6F, 3.39821E-6F, 3.619045E-6F, 3.8542307E-6F, 4.1047006E-6F, 4.371447E-6F, 4.6555283E-6F, 4.958071E-6F, 5.280274E-6F, 5.623416E-6F, 5.988857E-6F, 6.3780467E-6F, 6.7925284E-6F, 7.2339453E-6F, 7.704048E-6F, 8.2047E-6F, 8.737888E-6F, 9.305725E-6F, 9.910464E-6F, 1.0554501E-5F, 1.1240392E-5F, 1.1970856E-5F, 1.2748789E-5F, 1.3577278E-5F, 1.4459606E-5F, 1.5399271E-5F, 1.6400005E-5F, 1.7465769E-5F, 1.8600793E-5F, 1.9809577E-5F, 2.1096914E-5F, 2.2467912E-5F, 2.3928002E-5F, 2.5482977E-5F, 2.7139005E-5F, 2.890265E-5F, 3.078091E-5F, 3.2781227E-5F, 3.4911533E-5F, 3.718028E-5F, 3.9596467E-5F, 4.2169668E-5F, 4.491009E-5F, 4.7828602E-5F, 5.0936775E-5F, 5.424693E-5F, 5.7772202E-5F, 6.152657E-5F, 6.552491E-5F, 6.9783084E-5F, 7.4317984E-5F, 7.914758E-5F, 8.429104E-5F, 8.976875E-5F, 9.560242E-5F, 1.0181521E-4F, 1.0843174E-4F, 1.1547824E-4F, 1.2298267E-4F, 1.3097477E-4F, 1.3948625E-4F, 1.4855085E-4F, 1.5820454E-4F, 1.6848555E-4F, 1.7943469E-4F, 1.9109536E-4F, 2.0351382E-4F, 2.167393E-4F, 2.3082423E-4F, 2.4582449E-4F, 2.6179955E-4F, 2.7881275E-4F, 2.9693157E-4F, 3.1622787E-4F, 3.3677815E-4F, 3.5866388E-4F, 3.8197188E-4F, 4.0679457E-4F, 4.3323037E-4F, 4.613841E-4F, 4.913675E-4F, 5.2329927E-4F, 5.573062E-4F, 5.935231E-4F, 6.320936E-4F, 6.731706E-4F, 7.16917E-4F, 7.635063E-4F, 8.1312325E-4F, 8.6596457E-4F, 9.2223985E-4F, 9.821722E-4F, 0.0010459992F, 0.0011139743F, 0.0011863665F, 0.0012634633F, 0.0013455702F, 0.0014330129F, 0.0015261382F, 0.0016253153F, 0.0017309374F, 0.0018434235F, 0.0019632196F, 0.0020908006F, 0.0022266726F, 0.0023713743F, 0.0025254795F, 0.0026895993F, 0.0028643848F, 0.0030505287F, 0.003248769F, 0.0034598925F, 0.0036847359F, 0.0039241905F, 0.0041792067F, 0.004450795F, 0.004740033F, 0.005048067F, 0.0053761187F, 0.005725489F, 0.0060975635F, 0.0064938175F, 0.0069158226F, 0.0073652514F, 0.007843887F, 0.008353627F, 0.008896492F, 0.009474637F, 0.010090352F, 0.01074608F, 0.011444421F, 0.012188144F, 0.012980198F, 0.013823725F, 0.014722068F, 0.015678791F, 0.016697686F, 0.017782796F, 0.018938422F, 0.020169148F, 0.021479854F, 0.022875736F, 0.02436233F, 0.025945531F, 0.027631618F, 0.029427277F, 0.031339627F, 0.03337625F, 0.035545226F, 0.037855156F, 0.0403152F, 0.042935107F, 0.045725275F, 0.048696756F, 0.05186135F, 0.05523159F, 0.05882085F, 0.062643364F, 0.06671428F, 0.07104975F, 0.075666964F, 0.08058423F, 0.08582105F, 0.09139818F, 0.097337745F, 0.1036633F, 0.11039993F, 0.11757434F, 0.12521498F, 0.13335215F, 0.14201812F, 0.15124726F, 0.16107617F, 0.1715438F, 0.18269168F, 0.19456401F, 0.20720787F, 0.22067343F, 0.23501402F, 0.25028655F, 0.26655158F, 0.28387362F, 0.3023213F, 0.32196787F, 0.34289113F, 0.36517414F, 0.3889052F, 0.41417846F, 0.44109413F, 0.4697589F, 0.50028646F, 0.53279793F, 0.5674221F, 0.6042964F, 0.64356697F, 0.6853896F, 0.72993004F, 0.777365F, 0.8278826F, 0.88168305F, 0.9389798F, 1.0F}; // L: 9
	}

	VorbisFloor() {
		class60 var1 = VorbisSample.field392; // L: 80
		int var2 = var1.method1138(16); // L: 81
		if (var2 != 1) { // L: 82
			throw new RuntimeException(); // L: 83
		} else {
			int var3 = var1.method1138(5); // L: 85
			int var4 = 0; // L: 86
			this.field272 = new int[var3]; // L: 87

			int var5;
			int var6;
			for (var5 = 0; var5 < var3; ++var5) { // L: 88
				var6 = var1.method1138(4); // L: 89
				this.field272[var5] = var6; // L: 90
				if (var6 >= var4) { // L: 91
					var4 = var6 + 1;
				}
			}

			this.field275 = new int[var4]; // L: 93
			this.field277 = new int[var4]; // L: 94
			this.field270 = new int[var4]; // L: 95
			this.field278 = new int[var4][]; // L: 96

			int var8;
			for (var5 = 0; var5 < var4; ++var5) { // L: 97
				this.field275[var5] = var1.method1138(3) + 1; // L: 98
				var6 = this.field277[var5] = var1.method1138(2); // L: 99
				if (var6 != 0) { // L: 100
					this.field270[var5] = var1.method1138(8);
				}

				var6 = 1 << var6; // L: 101
				int[] var10 = new int[var6]; // L: 102
				this.field278[var5] = var10; // L: 103

				for (var8 = 0; var8 < var6; ++var8) { // L: 104
					var10[var8] = var1.method1138(8) - 1;
				}
			}

			this.multiplier = var1.method1138(2) + 1; // L: 106
			var5 = var1.method1138(4); // L: 107
			var6 = 2; // L: 108

			int var7;
			for (var7 = 0; var7 < var3; ++var7) { // L: 109
				var6 += this.field275[this.field272[var7]];
			}

			this.field274 = new int[var6]; // L: 110
			this.field274[0] = 0; // L: 111
			this.field274[1] = 1 << var5; // L: 112
			var6 = 2; // L: 113

			for (var7 = 0; var7 < var3; ++var7) { // L: 114
				var8 = this.field272[var7]; // L: 115

				for (int var9 = 0; var9 < this.field275[var8]; ++var9) { // L: 116
					this.field274[var6++] = var1.method1138(var5);
				}
			}

		}
	} // L: 118

	@ObfuscatedName("aq")
	int method730(int[] var1, int var2) {
		int var3 = var1[var2]; // L: 19
		int var4 = -1; // L: 20
		int var5 = Integer.MIN_VALUE; // L: 21

		for (int var6 = 0; var6 < var2; ++var6) { // L: 22
			int var7 = var1[var6]; // L: 23
			if (var7 < var3 && var7 > var5) { // L: 24
				var4 = var6; // L: 25
				var5 = var7; // L: 26
			}
		}

		return var4; // L: 29
	}

	@ObfuscatedName("aw")
	int method738(int[] var1, int var2) {
		int var3 = var1[var2]; // L: 33
		int var4 = -1; // L: 34
		int var5 = Integer.MAX_VALUE; // L: 35

		for (int var6 = 0; var6 < var2; ++var6) { // L: 36
			int var7 = var1[var6]; // L: 37
			if (var7 > var3 && var7 < var5) { // L: 38
				var4 = var6; // L: 39
				var5 = var7; // L: 40
			}
		}

		return var4; // L: 43
	}

	@ObfuscatedName("al")
	int method725(int var1, int var2, int var3, int var4, int var5) {
		int var6 = var4 - var2; // L: 47
		int var7 = var3 - var1; // L: 48
		int var8 = var6 < 0 ? -var6 : var6; // L: 49
		int var9 = (var5 - var1) * var8; // L: 50
		int var10 = var9 / var7; // L: 51
		return var6 < 0 ? var2 - var10 : var10 + var2; // L: 52
	}

	@ObfuscatedName("ai")
	void method726(int var1, int var2, int var3, int var4, float[] var5, int var6) {
		int var7 = var4 - var2; // L: 56
		int var8 = var3 - var1; // L: 57
		int var9 = var7 < 0 ? -var7 : var7; // L: 58
		int var10 = var7 / var8; // L: 59
		int var11 = var2; // L: 60
		int var12 = 0; // L: 61
		int var13 = var7 < 0 ? var10 - 1 : var10 + 1; // L: 62
		var9 -= (var10 < 0 ? -var10 : var10) * var8; // L: 63
		var5[var1] *= VorbisFloor_decibelStatics[var2]; // L: 64
		if (var3 > var6) { // L: 65
			var3 = var6;
		}

		for (int var14 = var1 + 1; var14 < var3; ++var14) { // L: 66
			var12 += var9; // L: 67
			if (var12 >= var8) { // L: 68
				var12 -= var8; // L: 69
				var11 += var13; // L: 70
			} else {
				var11 += var10; // L: 73
			}

			var5[var14] *= VorbisFloor_decibelStatics[var11]; // L: 75
		}

	} // L: 77

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lcl;)Lci;"
	)
	class59 method728(class60 var1) {
		boolean var2 = var1.method1139() != 0; // L: 121
		if (!var2) { // L: 122
			return new class59(this, false, (int[])null, (int[])null, (boolean[])null);
		} else {
			class59 var3 = new class59(this, true, (int[])null, (int[])null, (boolean[])null); // L: 123
			int var4 = this.field274.length; // L: 124
			if (var3.field424 == null || var3.field424.length < var4) { // L: 125
				var3.field424 = new int[var4]; // L: 126
				var3.field422 = new int[var4]; // L: 127
				var3.field426 = new boolean[var4]; // L: 128
			}

			int var5;
			for (var5 = 0; var5 < var4; ++var5) { // L: 130
				var3.field424[var5] = this.field274[var5];
			}

			var5 = field276[this.multiplier - 1]; // L: 131
			int var6 = WorldMapAreaData.iLog(var5 - 1); // L: 132
			var3.field422[0] = var1.method1138(var6); // L: 133
			var3.field422[1] = var1.method1138(var6); // L: 134
			int var7 = 2; // L: 135

			for (int var8 = 0; var8 < this.field272.length; ++var8) { // L: 136
				int var9 = this.field272[var8]; // L: 137
				int var10 = this.field275[var9]; // L: 138
				int var11 = this.field277[var9]; // L: 139
				int var12 = (1 << var11) - 1; // L: 140
				int var13 = 0; // L: 141
				if (var11 > 0) { // L: 142
					var13 = VorbisSample.field374[this.field270[var9]].method1042(var1);
				}

				for (int var14 = 0; var14 < var10; ++var14) { // L: 143
					int var15 = this.field278[var9][var13 & var12]; // L: 144
					var13 >>>= var11; // L: 145
					var3.field422[var7++] = var15 >= 0 ? VorbisSample.field374[var15].method1042(var1) : 0; // L: 146
				}
			}

			return var3; // L: 149
		}
	}
}

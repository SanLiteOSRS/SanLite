import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mi")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	@Export("superStream")
	MidiPcmStream superStream;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	@Export("queue")
	NodeDeque queue;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lbe;"
	)
	@Export("mixer")
	PcmStreamMixer mixer;

	@ObfuscatedSignature(
		descriptor = "(Llb;)V"
	)
	MusicPatchPcmStream(MidiPcmStream var1) {
		this.queue = new NodeDeque(); // L: 11
		this.mixer = new PcmStreamMixer(); // L: 12
		this.superStream = var1; // L: 15
	} // L: 16

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lma;[IIIII)V",
		garbageValue = "1003390215"
	)
	void method5923(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
		if ((this.superStream.field3421[var1.field3490] & 4) != 0 && var1.field3489 < 0) { // L: 73
			int var6 = this.superStream.field3430[var1.field3490] / PcmPlayer.field291; // L: 74

			while (true) {
				int var7 = (var6 + 1048575 - var1.field3483) / var6; // L: 76
				if (var7 > var4) { // L: 77
					var1.field3483 += var6 * var4; // L: 99
					break;
				}

				var1.stream.fill(var2, var3, var7); // L: 78
				var3 += var7; // L: 79
				var4 -= var7; // L: 80
				var1.field3483 += var6 * var7 - 1048576; // L: 81
				int var8 = PcmPlayer.field291 / 100; // L: 82
				int var9 = 262144 / var6; // L: 83
				if (var9 < var8) { // L: 84
					var8 = var9;
				}

				RawPcmStream var10 = var1.stream; // L: 85
				if (this.superStream.field3424[var1.field3490] == 0) { // L: 86
					var1.stream = RawPcmStream.method949(var1.rawSound, var10.method865(), var10.method856(), var10.method857()); // L: 87
				} else {
					var1.stream = RawPcmStream.method949(var1.rawSound, var10.method865(), 0, var10.method857()); // L: 90
					this.superStream.method5781(var1, var1.table.field3462[var1.field3480] < 0); // L: 91
					var1.stream.method910(var8, var10.method856()); // L: 92
				}

				if (var1.table.field3462[var1.field3480] < 0) { // L: 94
					var1.stream.setNumLoops(-1);
				}

				var10.method863(var8); // L: 95
				var10.fill(var2, var3, var5 - var3); // L: 96
				if (var10.method944()) { // L: 97
					this.mixer.addSubStream(var10);
				}
			}
		}

		var1.stream.fill(var2, var3, var4); // L: 101
	} // L: 102

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lma;IS)V",
		garbageValue = "19357"
	)
	void method5933(MusicPatchNode var1, int var2) {
		if ((this.superStream.field3421[var1.field3490] & 4) != 0 && var1.field3489 < 0) { // L: 105
			int var3 = this.superStream.field3430[var1.field3490] / PcmPlayer.field291; // L: 106
			int var4 = (var3 + 1048575 - var1.field3483) / var3; // L: 107
			var1.field3483 = var3 * var2 + var1.field3483 & 1048575; // L: 108
			if (var4 <= var2) { // L: 109
				if (this.superStream.field3424[var1.field3490] == 0) { // L: 110
					var1.stream = RawPcmStream.method949(var1.rawSound, var1.stream.method865(), var1.stream.method856(), var1.stream.method857()); // L: 111
				} else {
					var1.stream = RawPcmStream.method949(var1.rawSound, var1.stream.method865(), 0, var1.stream.method857()); // L: 114
					this.superStream.method5781(var1, var1.table.field3462[var1.field3480] < 0); // L: 115
				}

				if (var1.table.field3462[var1.field3480] < 0) { // L: 117
					var1.stream.setNumLoops(-1);
				}

				var2 = var1.field3483 / var3; // L: 118
			}
		}

		var1.stream.skip(var2);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "()Lby;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		MusicPatchNode var1 = (MusicPatchNode)this.queue.last(); // L: 19
		if (var1 == null) {
			return null; // L: 20
		} else {
			return (PcmStream)(var1.stream != null ? var1.stream : this.nextSubStream()); // L: 21 22
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()Lby;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		MusicPatchNode var1;
		do {
			var1 = (MusicPatchNode)this.queue.previous(); // L: 27
			if (var1 == null) {
				return null; // L: 28
			}
		} while(var1.stream == null); // L: 29

		return var1.stream;
	}

	@ObfuscatedName("ak")
	protected int vmethod5920() {
		return 0;
	}

	@ObfuscatedName("ae")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		this.mixer.fill(var1, var2, var3);

		for (MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method5770(var6)) {
				int var4 = var2;
				int var5 = var3; // L: 44

				do {
					if (var5 <= var6.field3494) {
						this.method5923(var6, var1, var4, var5, var4 + var5);
						var6.field3494 -= var5;
						break;
					}

					this.method5923(var6, var1, var4, var6.field3494, var5 + var4); // L: 46
					var4 += var6.field3494; // L: 47
					var5 -= var6.field3494; // L: 48
				} while(!this.superStream.method5771(var6, var1, var4, var5));
			}
		}

	}

	@ObfuscatedName("ao")
	@Export("skip")
	protected void skip(int var1) {
		this.mixer.skip(var1);

		for (MusicPatchNode var3 = (MusicPatchNode)this.queue.last(); var3 != null; var3 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method5770(var3)) {
				int var2 = var1;

				do {
					if (var2 <= var3.field3494) {
						this.method5933(var3, var2);
						var3.field3494 -= var2; // L: 68
						break;
					}

					this.method5933(var3, var3.field3494);
					var2 -= var3.field3494;
				} while(!this.superStream.method5771(var3, (int[])null, 0, var2));
			}
		}

	}

	@ObfuscatedName("an")
	public static String method5943(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) { // L: 31
			if (var0 % 37L == 0L) { // L: 32
				return null;
			} else {
				int var2 = 0; // L: 33

				for (long var3 = var0; 0L != var3; var3 /= 37L) { // L: 34 35 37
					++var2; // L: 36
				}

				StringBuilder var5 = new StringBuilder(var2); // L: 39

				while (var0 != 0L) { // L: 40
					long var6 = var0; // L: 41
					var0 /= 37L; // L: 42
					var5.append(class386.base37Table[(int)(var6 - var0 * 37L)]); // L: 43
				}

				return var5.reverse().toString(); // L: 45
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("av")
	@Export("base37DecodeLong")
	public static String base37DecodeLong(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) { // L: 49
			if (0L == var0 % 37L) { // L: 50
				return null;
			} else {
				int var2 = 0; // L: 51

				for (long var3 = var0; var3 != 0L; var3 /= 37L) { // L: 52 53 55
					++var2; // L: 54
				}

				StringBuilder var5;
				char var8;
				for (var5 = new StringBuilder(var2); 0L != var0; var5.append(var8)) { // L: 57 58 67
					long var6 = var0; // L: 59
					var0 /= 37L; // L: 60
					var8 = class386.base37Table[(int)(var6 - 37L * var0)]; // L: 61
					if (var8 == '_') { // L: 62
						int var9 = var5.length() - 1; // L: 63
						var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9))); // L: 64
						var8 = 160; // L: 65
					}
				}

				var5.reverse(); // L: 69
				var5.setCharAt(0, Character.toUpperCase(var5.charAt(0))); // L: 70
				return var5.toString(); // L: 71
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "113"
	)
	@Export("ByteArrayPool_release")
	public static synchronized void ByteArrayPool_release(byte[] var0) {
		if (var0.length == 100 && ByteArrayPool.ByteArrayPool_smallCount < ByteArrayPool.field4483) { // L: 120
			ByteArrayPool.ByteArrayPool_small[++ByteArrayPool.ByteArrayPool_smallCount - 1] = var0; // L: 121
		} else if (var0.length == 5000 && ByteArrayPool.ByteArrayPool_mediumCount < ByteArrayPool.field4484) { // L: 124
			ByteArrayPool.ByteArrayPool_medium[++ByteArrayPool.ByteArrayPool_mediumCount - 1] = var0; // L: 125
		} else if (var0.length == 10000 && ByteArrayPool.ByteArrayPool_largeCount < ByteArrayPool.field4485) { // L: 128
			ByteArrayPool.ByteArrayPool_large[++ByteArrayPool.ByteArrayPool_largeCount - 1] = var0; // L: 129
		} else if (var0.length == 30000 && ByteArrayPool.field4479 < ByteArrayPool.field4486) { // L: 132
			ByteArrayPool.field4494[++ByteArrayPool.field4479 - 1] = var0; // L: 133
		} else {
			if (JagexCache.ByteArrayPool_arrays != null) { // L: 136
				for (int var1 = 0; var1 < class152.ByteArrayPool_alternativeSizes.length; ++var1) { // L: 137
					if (var0.length == class152.ByteArrayPool_alternativeSizes[var1] && PendingSpawn.ByteArrayPool_altSizeArrayCounts[var1] < JagexCache.ByteArrayPool_arrays[var1].length) { // L: 138
						JagexCache.ByteArrayPool_arrays[var1][PendingSpawn.ByteArrayPool_altSizeArrayCounts[var1]++] = var0; // L: 139
						return; // L: 140
					}
				}
			}

		}
	} // L: 122 126 130 134 144

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Lmb;IIB)V",
		garbageValue = "-111"
	)
	public static void method5941(Widget var0, int var1, int var2) {
		PlayerComposition var3 = var0.field3631; // L: 1036
		boolean var4 = var2 != var3.field3540; // L: 1037
		var3.field3540 = var2; // L: 1038
		if (var4) { // L: 1039
			int var5;
			int var7;
			if (var3.field3540 == var1) { // L: 1040
				for (var5 = 0; var5 < PlayerComposition.equipmentIndices.length; ++var5) { // L: 1041
					var7 = PlayerComposition.equipmentIndices[var5]; // L: 1042
					if (var3.equipment[var7] > 0 && var3.equipment[var7] < 512) { // L: 1043
						var3.equipment[var7] = var3.field3544[var7]; // L: 1044
					}
				}
			} else {
				label72: {
					if (var3.equipment[0] >= 512) { // L: 1050
						boolean var8;
						if (var3.equipment[0] < 512) { // L: 1053
							var8 = false; // L: 1058
						} else {
							ItemComposition var6 = class300.ItemComposition_get(var3.equipment[0] - 512); // L: 1054
							var8 = var6.maleModel1 != class208.field2312.field2315 && var6.maleModel2 != class208.field2312.field2315; // L: 1055
						}

						if (!var8) { // L: 1060
							break label72;
						}
					}

					var3.equipment[class208.field2312.field2315] = 1; // L: 1062
				}

				for (var5 = 0; var5 < 7; ++var5) { // L: 1064
					var7 = PlayerComposition.equipmentIndices[var5]; // L: 1065
					if (var3.equipment[var7] > 0 && var3.equipment[var7] < 512) { // L: 1066
						class59.method1116(var2, var3.equipment, var5); // L: 1067
					}
				}
			}
		}

		var3.method6021(); // L: 1072
	} // L: 1073
}

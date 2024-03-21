import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hn")
@Implements("SpotAnimationDefinition")
public class SpotAnimationDefinition extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("SpotAnimationDefinition_archive")
	public static AbstractArchive SpotAnimationDefinition_archive;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	public static AbstractArchive field2034;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("SpotAnimationDefinition_cached")
	public static EvictingDualNodeHashTable SpotAnimationDefinition_cached;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	public static EvictingDualNodeHashTable field2036;
	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	static Archive field2045;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -529104789
	)
	@Export("id")
	int id;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 651213805
	)
	@Export("archive")
	int archive;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 87795567
	)
	@Export("sequence")
	public int sequence;
	@ObfuscatedName("az")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("ao")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("au")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("ak")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1014748399
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -41021843
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -2065636433
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 156830159
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -846309613
	)
	@Export("contrast")
	int contrast;

	static {
		SpotAnimationDefinition_cached = new EvictingDualNodeHashTable(64); // L: 14
		field2036 = new EvictingDualNodeHashTable(30); // L: 15
	}

	SpotAnimationDefinition() {
		this.sequence = -1; // L: 18
		this.widthScale = 128; // L: 23
		this.heightScale = 128; // L: 24
		this.orientation = 0; // L: 25
		this.ambient = 0; // L: 26
		this.contrast = 0; // L: 27
	} // L: 29

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "-1313689172"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 44
			if (var2 == 0) { // L: 45
				return; // L: 48
			}

			this.decodeNext(var1, var2); // L: 46
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Luq;II)V",
		garbageValue = "1262911593"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 51
			this.archive = var1.readUnsignedShort();
		} else if (var2 == 2) { // L: 52
			this.sequence = var1.readUnsignedShort();
		} else if (var2 == 4) { // L: 53
			this.widthScale = var1.readUnsignedShort();
		} else if (var2 == 5) { // L: 54
			this.heightScale = var1.readUnsignedShort();
		} else if (var2 == 6) { // L: 55
			this.orientation = var1.readUnsignedShort();
		} else if (var2 == 7) { // L: 56
			this.ambient = var1.readUnsignedByte();
		} else if (var2 == 8) { // L: 57
			this.contrast = var1.readUnsignedByte();
		} else {
			int var3;
			int var4;
			if (var2 == 40) { // L: 58
				var3 = var1.readUnsignedByte(); // L: 59
				this.recolorFrom = new short[var3]; // L: 60
				this.recolorTo = new short[var3]; // L: 61

				for (var4 = 0; var4 < var3; ++var4) { // L: 62
					this.recolorFrom[var4] = (short)var1.readUnsignedShort(); // L: 63
					this.recolorTo[var4] = (short)var1.readUnsignedShort(); // L: 64
				}
			} else if (var2 == 41) { // L: 67
				var3 = var1.readUnsignedByte(); // L: 68
				this.retextureFrom = new short[var3]; // L: 69
				this.retextureTo = new short[var3]; // L: 70

				for (var4 = 0; var4 < var3; ++var4) { // L: 71
					this.retextureFrom[var4] = (short)var1.readUnsignedShort(); // L: 72
					this.retextureTo[var4] = (short)var1.readUnsignedShort(); // L: 73
				}
			}
		}

	} // L: 77

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IB)Lkz;",
		garbageValue = "-62"
	)
	@Export("getModel")
	public final Model getModel(int var1) {
		Model var2 = this.method3787(); // L: 80
		if (var2 == null) { // L: 81
			return null;
		} else {
			Model var3;
			if (this.sequence != -1 && var1 != -1) { // L: 83
				var3 = MilliClock.SequenceDefinition_get(this.sequence).method4060(var2, var1);
			} else {
				var3 = var2.method5704(true); // L: 84
			}

			if (this.widthScale != 128 || this.heightScale != 128) { // L: 85
				var3.scale(this.widthScale, this.heightScale, this.widthScale);
			}

			if (this.orientation != 0) { // L: 86
				if (this.orientation == 90) { // L: 87
					var3.rotateY90Ccw();
				}

				if (this.orientation == 180) { // L: 88
					var3.rotateY90Ccw(); // L: 89
					var3.rotateY90Ccw(); // L: 90
				}

				if (this.orientation == 270) { // L: 92
					var3.rotateY90Ccw(); // L: 93
					var3.rotateY90Ccw(); // L: 94
					var3.rotateY90Ccw(); // L: 95
				}
			}

			return var3; // L: 98
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Lkz;",
		garbageValue = "1900796983"
	)
	public final Model method3787() {
		Model var1 = (Model)field2036.get((long)this.id);
		if (var1 == null) { // L: 103
			ModelData var2 = ModelData.ModelData_get(field2034, this.archive, 0);
			if (var2 == null) {
				return null;
			}

			int var3;
			if (this.recolorFrom != null) { // L: 106
				for (var3 = 0; var3 < this.recolorFrom.length; ++var3) { // L: 107
					var2.recolor(this.recolorFrom[var3], this.recolorTo[var3]); // L: 108
				}
			}

			if (this.retextureFrom != null) { // L: 111
				for (var3 = 0; var3 < this.retextureFrom.length; ++var3) { // L: 112
					var2.retexture(this.retextureFrom[var3], this.retextureTo[var3]); // L: 113
				}
			}

			var1 = var2.toModel(this.ambient + 64, this.contrast + 850, -30, -50, -30); // L: 116
			field2036.put(var1, (long)this.id); // L: 117
		}

		return var1; // L: 119
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lvt;"
	)
	@Export("newRunException")
	public static RunException newRunException(Throwable var0, String var1) {
		RunException var2;
		if (var0 instanceof RunException) { // L: 100
			var2 = (RunException)var0; // L: 101
			var2.message = var2.message + ' ' + var1; // L: 102
		} else {
			var2 = new RunException(var0, var1); // L: 104
		}

		return var2; // L: 105
	}

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "(Ldj;I)Z",
		garbageValue = "-1345035276"
	)
	static boolean method3798(Player var0) {
		if (Client.drawPlayerNames == 0) { // L: 5189
			return false;
		} else {
			boolean var1;
			if (VarpDefinition.localPlayer != var0) { // L: 5190
				var1 = (Client.drawPlayerNames & 4) != 0; // L: 5193
				boolean var2 = var1 || class188.method3696() && var0.method2386(); // L: 5195
				if (!var2) { // L: 5196
					boolean var3 = (Client.drawPlayerNames & 2) != 0; // L: 5199
					var2 = var3 && var0.method2389(); // L: 5201
				}

				return var2; // L: 5203
			} else {
				var1 = (Client.drawPlayerNames & 8) != 0; // L: 5208
				return var1; // L: 5210
			}
		}
	}
}

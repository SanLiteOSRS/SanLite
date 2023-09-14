import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ha")
@Implements("SpotAnimationDefinition")
public class SpotAnimationDefinition extends DualNode {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	@Export("SpotAnimationDefinition_archive")
	public static AbstractArchive SpotAnimationDefinition_archive;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	public static AbstractArchive field2096;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("SpotAnimationDefinition_cached")
	public static EvictingDualNodeHashTable SpotAnimationDefinition_cached;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("SpotAnimationDefinition_cachedModels")
	public static EvictingDualNodeHashTable SpotAnimationDefinition_cachedModels;
	@ObfuscatedName("sl")
	@Export("FriendsChatManager_inFriendsChat")
	static boolean FriendsChatManager_inFriendsChat;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1143254317
	)
	@Export("id")
	int id;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 13212181
	)
	@Export("archive")
	int archive;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1431367329
	)
	@Export("sequence")
	public int sequence;
	@ObfuscatedName("ap")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("aa")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("af")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("ad")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 2044410789
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1484714697
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1490600117
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 115934601
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 472229573
	)
	@Export("contrast")
	int contrast;

	static {
		SpotAnimationDefinition_cached = new EvictingDualNodeHashTable(64); // L: 14
		SpotAnimationDefinition_cachedModels = new EvictingDualNodeHashTable(30); // L: 15
	}

	SpotAnimationDefinition() {
		this.sequence = -1; // L: 18
		this.widthScale = 128; // L: 23
		this.heightScale = 128; // L: 24
		this.orientation = 0; // L: 25
		this.ambient = 0; // L: 26
		this.contrast = 0; // L: 27
	} // L: 29

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ltm;B)V",
		garbageValue = "127"
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ltm;IB)V",
		garbageValue = "83"
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Ljr;",
		garbageValue = "620606809"
	)
	@Export("getModel")
	public final Model getModel(int var1) {
		Model var2 = this.method3750(); // L: 80
		Model var3;
		if (this.sequence != -1 && var1 != -1) { // L: 82
			var3 = EnumComposition.SequenceDefinition_get(this.sequence).transformSpotAnimationModel(var2, var1);
		} else {
			var3 = var2.toSharedSpotAnimationModel(true); // L: 83
		}

		if (this.widthScale != 128 || this.heightScale != 128) {
			var3.scale(this.widthScale, this.heightScale, this.widthScale); // L: 84
		}

		if (this.orientation != 0) { // L: 85
			if (this.orientation == 90) { // L: 86
				var3.rotateY90Ccw();
			}

			if (this.orientation == 180) { // L: 87
				var3.rotateY90Ccw(); // L: 88
				var3.rotateY90Ccw(); // L: 89
			}

			if (this.orientation == 270) { // L: 91
				var3.rotateY90Ccw(); // L: 92
				var3.rotateY90Ccw(); // L: 93
				var3.rotateY90Ccw(); // L: 94
			}
		}

		return var3; // L: 97
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Ljr;",
		garbageValue = "-10"
	)
	public final Model method3750() {
		Model var1 = (Model)SpotAnimationDefinition_cachedModels.get((long)this.id); // L: 101
		if (var1 == null) { // L: 102
			ModelData var2 = ModelData.ModelData_get(field2096, this.archive, 0); // L: 103
			if (var2 == null) { // L: 104
				return null;
			}

			int var3;
			if (this.recolorFrom != null) { // L: 105
				for (var3 = 0; var3 < this.recolorFrom.length; ++var3) { // L: 106
					var2.recolor(this.recolorFrom[var3], this.recolorTo[var3]); // L: 107
				}
			}

			if (this.retextureFrom != null) { // L: 110
				for (var3 = 0; var3 < this.retextureFrom.length; ++var3) { // L: 111
					var2.retexture(this.retextureFrom[var3], this.retextureTo[var3]); // L: 112
				}
			}

			var1 = var2.toModel(this.ambient + 64, this.contrast + 850, -30, -50, -30); // L: 115
			SpotAnimationDefinition_cachedModels.put(var1, (long)this.id); // L: 116
		}

		return var1; // L: 118
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Date;",
		garbageValue = "1382100876"
	)
	static Date method3765() throws ParseException {
		SimpleDateFormat var0 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH); // L: 1063
		var0.setLenient(false); // L: 1064
		StringBuilder var1 = new StringBuilder(); // L: 1065
		String[] var2 = Login.field954; // L: 1067

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 1068
			String var4 = var2[var3]; // L: 1069
			if (var4 == null) { // L: 1071
				PcmPlayer.method838(7); // L: 1073
				class318.setLoginResponseString("Date not valid.", "Please ensure all characters are populated.", ""); // L: 1074
				return null; // L: 1076
			}

			var1.append(var4); // L: 1078
		}

		var1.append("12"); // L: 1082
		return var0.parse(var1.toString()); // L: 1083
	}
}

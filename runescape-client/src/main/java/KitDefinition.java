import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Date;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ge")
@Implements("KitDefinition")
public class KitDefinition extends DualNode {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("KitDefinition_archive")
	public static AbstractArchive KitDefinition_archive;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("KitDefinition_modelsArchive")
	public static AbstractArchive KitDefinition_modelsArchive;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1269534839
	)
	public static int field1871;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("KitDefinition_cached")
	static EvictingDualNodeHashTable KitDefinition_cached;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 142413103
	)
	@Export("bodypartID")
	public int bodypartID;
	@ObfuscatedName("ar")
	@Export("models2")
	int[] models2;
	@ObfuscatedName("ag")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("ao")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("ae")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("aa")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("au")
	@Export("models")
	int[] models;
	@ObfuscatedName("an")
	@Export("nonSelectable")
	public boolean nonSelectable;

	static {
		KitDefinition_cached = new EvictingDualNodeHashTable(64); // L: 14
	}

	KitDefinition() {
		this.bodypartID = -1; // L: 15
		this.models = new int[]{-1, -1, -1, -1, -1}; // L: 21
		this.nonSelectable = false; // L: 22
	} // L: 26

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)V",
		garbageValue = "244058044"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 40
			if (var2 == 0) { // L: 41
				return; // L: 44
			}

			this.decodeNext(var1, var2); // L: 42
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Luk;II)V",
		garbageValue = "-1818382900"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 47
			this.bodypartID = var1.readUnsignedByte();
		} else {
			int var3;
			int var4;
			if (var2 == 2) { // L: 48
				var3 = var1.readUnsignedByte(); // L: 49
				this.models2 = new int[var3]; // L: 50

				for (var4 = 0; var4 < var3; ++var4) { // L: 51
					this.models2[var4] = var1.readUnsignedShort();
				}
			} else if (var2 == 3) { // L: 53
				this.nonSelectable = true;
			} else if (var2 == 40) { // L: 54
				var3 = var1.readUnsignedByte(); // L: 55
				this.recolorFrom = new short[var3]; // L: 56
				this.recolorTo = new short[var3]; // L: 57

				for (var4 = 0; var4 < var3; ++var4) { // L: 58
					this.recolorFrom[var4] = (short)var1.readUnsignedShort(); // L: 59
					this.recolorTo[var4] = (short)var1.readUnsignedShort(); // L: 60
				}
			} else if (var2 == 41) { // L: 63
				var3 = var1.readUnsignedByte(); // L: 64
				this.retextureFrom = new short[var3]; // L: 65
				this.retextureTo = new short[var3]; // L: 66

				for (var4 = 0; var4 < var3; ++var4) { // L: 67
					this.retextureFrom[var4] = (short)var1.readUnsignedShort(); // L: 68
					this.retextureTo[var4] = (short)var1.readUnsignedShort(); // L: 69
				}
			} else if (var2 >= 60 && var2 < 70) { // L: 72
				this.models[var2 - 60] = var1.readUnsignedShort();
			}
		}

	} // L: 74

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1083492398"
	)
	@Export("ready")
	public boolean ready() {
		if (this.models2 == null) {
			return true;
		} else {
			boolean var1 = true;

			for (int var2 = 0; var2 < this.models2.length; ++var2) {
				if (!KitDefinition_modelsArchive.tryLoadFile(this.models2[var2], 0)) {
					var1 = false;
				}
			}

			return var1;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Lkm;",
		garbageValue = "-552136609"
	)
	@Export("getModelData")
	public ModelData getModelData() {
		if (this.models2 == null) {
			return null;
		} else {
			ModelData[] var1 = new ModelData[this.models2.length];

			for (int var2 = 0; var2 < this.models2.length; ++var2) {
				var1[var2] = ModelData.ModelData_get(KitDefinition_modelsArchive, this.models2[var2], 0);
			}

			ModelData var4;
			if (var1.length == 1) { // L: 88
				var4 = var1[0];
			} else {
				var4 = new ModelData(var1, var1.length);
			}

			int var3;
			if (this.recolorFrom != null) { // L: 90
				for (var3 = 0; var3 < this.recolorFrom.length; ++var3) {
					var4.recolor(this.recolorFrom[var3], this.recolorTo[var3]);
				}
			}

			if (this.retextureFrom != null) {
				for (var3 = 0; var3 < this.retextureFrom.length; ++var3) {
					var4.retexture(this.retextureFrom[var3], this.retextureTo[var3]);
				}
			}

			return var4;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1199111363"
	)
	public boolean method3665() {
		boolean var1 = true;

		for (int var2 = 0; var2 < 5; ++var2) {
			if (this.models[var2] != -1 && !KitDefinition_modelsArchive.tryLoadFile(this.models[var2], 0)) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Lkm;",
		garbageValue = "0"
	)
	@Export("getKitDefinitionModels")
	public ModelData getKitDefinitionModels() {
		ModelData[] var1 = new ModelData[5];
		int var2 = 0;

		for (int var3 = 0; var3 < 5; ++var3) {
			if (this.models[var3] != -1) { // L: 115
				var1[var2++] = ModelData.ModelData_get(KitDefinition_modelsArchive, this.models[var3], 0);
			}
		}

		ModelData var5 = new ModelData(var1, var2); // L: 117
		int var4;
		if (this.recolorFrom != null) {
			for (var4 = 0; var4 < this.recolorFrom.length; ++var4) {
				var5.recolor(this.recolorFrom[var4], this.recolorTo[var4]);
			}
		}

		if (this.retextureFrom != null) {
			for (var4 = 0; var4 < this.retextureFrom.length; ++var4) {
				var5.retexture(this.retextureFrom[var4], this.retextureTo[var4]);
			}
		}

		return var5;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)Lia;",
		garbageValue = "1"
	)
	public static class217 method3664() {
		return class217.field2340;
	}

	@ObfuscatedName("am")
	public static String method3654(long var0) {
		Calendar.Calendar_calendar.setTime(new Date(var0)); // L: 31
		int var2 = Calendar.Calendar_calendar.get(7); // L: 32
		int var3 = Calendar.Calendar_calendar.get(5); // L: 33
		int var4 = Calendar.Calendar_calendar.get(2); // L: 34
		int var5 = Calendar.Calendar_calendar.get(1); // L: 35
		int var6 = Calendar.Calendar_calendar.get(11); // L: 36
		int var7 = Calendar.Calendar_calendar.get(12); // L: 37
		int var8 = Calendar.Calendar_calendar.get(13); // L: 38
		return Calendar.DAYS_OF_THE_WEEK[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + Calendar.MONTH_NAMES_ENGLISH_GERMAN[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT"; // L: 39
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZI)I",
		garbageValue = "-795878581"
	)
	public static int method3666(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) { // L: 77
			boolean var3 = false; // L: 78
			boolean var4 = false; // L: 79
			int var5 = 0; // L: 80
			int var6 = var0.length(); // L: 81

			for (int var7 = 0; var7 < var6; ++var7) { // L: 82
				char var8 = var0.charAt(var7); // L: 83
				if (var7 == 0) { // L: 84
					if (var8 == '-') { // L: 85
						var3 = true; // L: 86
						continue;
					}

					if (var8 == '+') { // L: 89
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') { // L: 91
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') { // L: 92
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') { // L: 93
						throw new NumberFormatException(); // L: 94
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) { // L: 95
					throw new NumberFormatException();
				}

				if (var3) { // L: 96
					var10 = -var10;
				}

				int var9 = var5 * var1 + var10; // L: 97
				if (var9 / var1 != var5) { // L: 98
					throw new NumberFormatException();
				}

				var5 = var9; // L: 99
				var4 = true;
			}

			if (!var4) {
				throw new NumberFormatException();
			} else {
				return var5;
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "493796599"
	)
	static void method3668(int var0, int var1, int var2, int var3) {
		for (ObjectSound var4 = (ObjectSound)ObjectSound.objectSounds.last(); var4 != null; var4 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 100
			if (var4.soundEffectId != -1 || var4.soundEffectIds != null) { // L: 101
				int var5 = 0; // L: 102
				if (var1 > var4.maxX * 16384) { // L: 103
					var5 += var1 - var4.maxX * 16384;
				} else if (var1 < var4.x * 16384) { // L: 104
					var5 += var4.x * 16384 - var1;
				}

				if (var2 > var4.maxY * 16384) { // L: 105
					var5 += var2 - var4.maxY * 16384;
				} else if (var2 < var4.y * 16384) { // L: 106
					var5 += var4.y * 16384 - var2;
				}

				if (var5 - 64 <= var4.field844 && class93.clientPreferences.method2551() != 0 && var0 == var4.plane) { // L: 107
					var5 -= 64; // L: 118
					if (var5 < 0) { // L: 119
						var5 = 0;
					}

					int var6 = (var4.field844 - var5) * class93.clientPreferences.method2551() / var4.field844; // L: 120
					if (var4.stream1 == null) { // L: 121
						if (var4.soundEffectId >= 0) { // L: 122
							SoundEffect var7 = SoundEffect.readSoundEffect(class476.archive4, var4.soundEffectId, 0); // L: 123
							if (var7 != null) { // L: 124
								RawSound var8 = var7.toRawSound().resample(UrlRequest.decimator); // L: 125
								RawPcmStream var9 = RawPcmStream.createRawPcmStream(var8, 100, var6); // L: 126
								var9.setNumLoops(-1); // L: 127
								ClanSettings.pcmStreamMixer.addSubStream(var9); // L: 128
								var4.stream1 = var9; // L: 129
							}
						}
					} else {
						var4.stream1.method958(var6); // L: 133
					}

					if (var4.stream2 == null) { // L: 134
						if (var4.soundEffectIds != null && (var4.field842 -= var3) <= 0) { // L: 135
							int var11 = (int)(Math.random() * (double)var4.soundEffectIds.length); // L: 136
							SoundEffect var12 = SoundEffect.readSoundEffect(class476.archive4, var4.soundEffectIds[var11], 0); // L: 137
							if (var12 != null) { // L: 138
								RawSound var13 = var12.toRawSound().resample(UrlRequest.decimator); // L: 139
								RawPcmStream var10 = RawPcmStream.createRawPcmStream(var13, 100, var6); // L: 140
								var10.setNumLoops(0); // L: 141
								ClanSettings.pcmStreamMixer.addSubStream(var10); // L: 142
								var4.stream2 = var10; // L: 143
								var4.field842 = var4.field834 + (int)(Math.random() * (double)(var4.field840 - var4.field834)); // L: 144
							}
						}
					} else {
						var4.stream2.method958(var6); // L: 149
						if (!var4.stream2.hasNext()) { // L: 150
							var4.stream2 = null; // L: 151
						}
					}
				} else {
					if (var4.stream1 != null) { // L: 108
						ClanSettings.pcmStreamMixer.removeSubStream(var4.stream1); // L: 109
						var4.stream1 = null; // L: 110
					}

					if (var4.stream2 != null) { // L: 112
						ClanSettings.pcmStreamMixer.removeSubStream(var4.stream2); // L: 113
						var4.stream2 = null; // L: 114
					}
				}
			}
		}

	} // L: 155

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "643950659"
	)
	static int method3640(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class31.scriptDotWidget : class185.field1932; // L: 1613
		if (var0 == ScriptOpcodes.CC_GETTARGETMASK) { // L: 1614
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class155.Widget_unpackTargetMask(class405.getWidgetFlags(var3)); // L: 1615
			return 1; // L: 1616
		} else if (var0 != ScriptOpcodes.CC_GETOP) { // L: 1618
			if (var0 == ScriptOpcodes.CC_GETOPBASE) { // L: 1625
				if (var3.dataText == null) { // L: 1626
					Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var3.dataText; // L: 1627
				}

				return 1; // L: 1628
			} else {
				return 2; // L: 1630
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 1619
			--var4; // L: 1620
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) { // L: 1621
				Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var3.actions[var4]; // L: 1622
			} else {
				Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = "";
			}

			return 1; // L: 1623
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1687144963"
	)
	@Export("getGcDuration")
	protected static int getGcDuration() {
		int var0 = 0; // L: 641
		if (class9.garbageCollector == null || !class9.garbageCollector.isValid()) { // L: 642
			try {
				Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator(); // L: 644

				while (var1.hasNext()) {
					GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next(); // L: 645
					if (var2.isValid()) { // L: 647
						class9.garbageCollector = var2; // L: 648
						GameEngine.garbageCollectorLastCheckTimeMs = -1L; // L: 649
						GameEngine.garbageCollectorLastCollectionTime = -1L; // L: 650
					}
				}
			} catch (Throwable var11) { // L: 655
			}
		}

		if (class9.garbageCollector != null) { // L: 657
			long var9 = UserComparator9.method2973(); // L: 658
			long var3 = class9.garbageCollector.getCollectionTime(); // L: 659
			if (-1L != GameEngine.garbageCollectorLastCollectionTime) { // L: 660
				long var5 = var3 - GameEngine.garbageCollectorLastCollectionTime; // L: 661
				long var7 = var9 - GameEngine.garbageCollectorLastCheckTimeMs; // L: 662
				if (0L != var7) { // L: 663
					var0 = (int)(100L * var5 / var7);
				}
			}

			GameEngine.garbageCollectorLastCollectionTime = var3; // L: 665
			GameEngine.garbageCollectorLastCheckTimeMs = var9; // L: 666
		}

		return var0; // L: 668
	}
}

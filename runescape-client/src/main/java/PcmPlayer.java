import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bu")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1073973167
	)
	public static int field279;
	@ObfuscatedName("ax")
	@Export("PcmPlayer_stereo")
	protected static boolean PcmPlayer_stereo;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lbb;"
	)
	@Export("soundSystem")
	static SoundSystem soundSystem;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lbr;"
	)
	@Export("pcmPlayerProvider")
	static class51 pcmPlayerProvider;
	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "Lnv;"
	)
	@Export("archive5")
	static Archive archive5;
	@ObfuscatedName("ip")
	@ObfuscatedGetter(
		longValue = 7140429917568400665L
	)
	static long field274;
	@ObfuscatedName("ah")
	@Export("samples")
	protected int[] samples;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lba;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1321413645
	)
	int field268;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		longValue = 4908173107482116815L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 901234685
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -804594561
	)
	int field271;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -393652797
	)
	int field272;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		longValue = -1575193159291729041L
	)
	long field273;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 212833809
	)
	int field285;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -291526127
	)
	int field275;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 819270107
	)
	int field276;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		longValue = 7542233263024730763L
	)
	long field277;
	@ObfuscatedName("ai")
	boolean field282;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 1867067787
	)
	int field283;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "[Lba;"
	)
	PcmStream[] field280;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "[Lba;"
	)
	PcmStream[] field281;

	protected PcmPlayer() {
		this.field268 = 32; // L: 22
		this.timeMs = Canvas.method310(); // L: 23
		this.field273 = 0L; // L: 27
		this.field285 = 0; // L: 28
		this.field275 = 0; // L: 29
		this.field276 = 0; // L: 30
		this.field277 = 0L; // L: 31
		this.field282 = true; // L: 32
		this.field283 = 0; // L: 38
		this.field280 = new PcmStream[8]; // L: 39
		this.field281 = new PcmStream[8]; // L: 40
	} // L: 42

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "228187145"
	)
	@Export("init")
	protected void init() throws Exception {
	} // L: 284

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-16"
	)
	@Export("open")
	protected void open(int var1) throws Exception {
	} // L: 285

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1779535694"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity; // L: 288
	}

	@ObfuscatedName("ab")
	@Export("write")
	protected void write() throws Exception {
	} // L: 291

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-119"
	)
	@Export("close")
	protected void close() {
	} // L: 292

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2004255630"
	)
	@Export("discard")
	protected void discard() throws Exception {
	} // L: 293

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lba;I)V",
		garbageValue = "593087768"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1; // L: 83
	} // L: 84

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1340391416"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) { // L: 87
			long var1 = Canvas.method310(); // L: 88

			try {
				if (this.field273 != 0L) { // L: 90
					if (var1 < this.field273) { // L: 91
						return;
					}

					this.open(this.capacity); // L: 92
					this.field273 = 0L; // L: 93
					this.field282 = true; // L: 94
				}

				int var3 = this.position(); // L: 96
				if (this.field276 - var3 > this.field285) { // L: 97
					this.field285 = this.field276 - var3;
				}

				int var4 = this.field271 + this.field272; // L: 98
				if (var4 + 256 > 16384) { // L: 99
					var4 = 16128;
				}

				if (var4 + 256 > this.capacity) { // L: 100
					this.capacity += 1024; // L: 101
					if (this.capacity > 16384) { // L: 102
						this.capacity = 16384;
					}

					this.close(); // L: 103
					this.open(this.capacity); // L: 104
					var3 = 0; // L: 105
					this.field282 = true; // L: 106
					if (var4 + 256 > this.capacity) { // L: 107
						var4 = this.capacity - 256; // L: 108
						this.field272 = var4 - this.field271; // L: 109
					}
				}

				while (var3 < var4) { // L: 112
					this.fill(this.samples, 256); // L: 113
					this.write(); // L: 114
					var3 += 256; // L: 115
				}

				if (var1 > this.field277) { // L: 117
					if (!this.field282) { // L: 118
						if (this.field285 == 0 && this.field275 == 0) { // L: 119
							this.close(); // L: 120
							this.field273 = var1 + 2000L; // L: 121
							return; // L: 122
						}

						this.field272 = Math.min(this.field275, this.field285); // L: 124
						this.field275 = this.field285; // L: 125
					} else {
						this.field282 = false; // L: 127
					}

					this.field285 = 0; // L: 128
					this.field277 = var1 + 2000L; // L: 129
				}

				this.field276 = var3; // L: 131
			} catch (Exception var7) { // L: 133
				this.close(); // L: 134
				this.field273 = 2000L + var1; // L: 135
			}

			try {
				if (var1 > 500000L + this.timeMs) { // L: 138
					var1 = this.timeMs;
				}

				while (var1 > 5000L + this.timeMs) { // L: 139
					this.skip(256); // L: 140
					this.timeMs += (long)(256000 / field279); // L: 141
				}
			} catch (Exception var6) { // L: 144
				this.timeMs = var1; // L: 145
			}

		}
	} // L: 147

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-121"
	)
	public final void method796() {
		this.field282 = true; // L: 150
	} // L: 151

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1294159354"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field282 = true; // L: 154

		try {
			this.discard(); // L: 156
		} catch (Exception var2) { // L: 158
			this.close(); // L: 159
			this.field273 = Canvas.method310() + 2000L; // L: 160
		}

	} // L: 162

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-460451485"
	)
	@Export("shutdown")
	public final synchronized void shutdown() {
		if (soundSystem != null) { // L: 165
			boolean var1 = true; // L: 166

			for (int var2 = 0; var2 < 2; ++var2) { // L: 167
				if (this == soundSystem.players[var2]) { // L: 168
					soundSystem.players[var2] = null;
				}

				if (soundSystem.players[var2] != null) { // L: 169
					var1 = false;
				}
			}

			if (var1) { // L: 171
				class448.soundSystemExecutor.shutdownNow(); // L: 172
				class448.soundSystemExecutor = null; // L: 173
				soundSystem = null; // L: 174
			}
		}

		this.close(); // L: 177
		this.samples = null; // L: 178
	} // L: 179

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-128"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field283 -= var1; // L: 182
		if (this.field283 < 0) {
			this.field283 = 0; // L: 183
		}

		if (this.stream != null) {
			this.stream.skip(var1); // L: 184
		}

	} // L: 185

	@ObfuscatedName("bq")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2; // L: 189
		if (PcmPlayer_stereo) { // L: 190
			var3 = var2 << 1;
		}

		class397.clearIntArray(var1, 0, var3); // L: 191
		this.field283 -= var2; // L: 192
		if (this.stream != null && this.field283 <= 0) { // L: 193
			this.field283 += field279 >> 4; // L: 194
			Skills.PcmStream_disable(this.stream); // L: 195
			this.method781(this.stream, this.stream.vmethod1021()); // L: 196
			int var4 = 0; // L: 197
			int var5 = 255; // L: 198

			int var6;
			PcmStream var10;
			label108:
			for (var6 = 7; var5 != 0; --var6) { // L: 199
				int var7;
				int var8;
				if (var6 < 0) { // L: 202
					var7 = var6 & 3; // L: 203
					var8 = -(var6 >> 2); // L: 204
				} else {
					var7 = var6; // L: 207
					var8 = 0; // L: 208
				}

				for (int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) { // L: 210 212
					if ((var9 & 1) != 0) { // L: 215
						var5 &= ~(1 << var7); // L: 218
						var10 = null; // L: 219
						PcmStream var11 = this.field280[var7]; // L: 220

						label102:
						while (true) {
							while (true) {
								if (var11 == null) { // L: 221
									break label102;
								}

								AbstractSound var12 = var11.sound; // L: 222
								if (var12 != null && var12.position > var8) { // L: 223
									var5 |= 1 << var7; // L: 224
									var10 = var11; // L: 225
									var11 = var11.after; // L: 226
								} else {
									var11.active = true; // L: 229
									int var13 = var11.vmethod6018(); // L: 230
									var4 += var13; // L: 231
									if (var12 != null) {
										var12.position += var13; // L: 232
									}

									if (var4 >= this.field268) { // L: 233
										break label108;
									}

									PcmStream var14 = var11.firstSubStream(); // L: 234
									if (var14 != null) { // L: 235
										for (int var15 = var11.field337; var14 != null; var14 = var11.nextSubStream()) { // L: 236 237 239
											this.method781(var14, var15 * var14.vmethod1021() >> 8); // L: 238
										}
									}

									PcmStream var18 = var11.after; // L: 242
									var11.after = null; // L: 243
									if (var10 == null) { // L: 244
										this.field280[var7] = var18;
									} else {
										var10.after = var18; // L: 245
									}

									if (var18 == null) { // L: 246
										this.field281[var7] = var10;
									}

									var11 = var18; // L: 247
								}
							}
						}
					}

					var7 += 4; // L: 211
					++var8;
				}
			}

			for (var6 = 0; var6 < 8; ++var6) { // L: 251
				PcmStream var16 = this.field280[var6]; // L: 252
				PcmStream[] var17 = this.field280; // L: 253
				this.field281[var6] = null; // L: 255

				for (var17[var6] = null; var16 != null; var16 = var10) { // L: 256 257 260
					var10 = var16.after; // L: 258
					var16.after = null; // L: 259
				}
			}
		}

		if (this.field283 < 0) { // L: 264
			this.field283 = 0;
		}

		if (this.stream != null) { // L: 265
			this.stream.fill(var1, 0, var2);
		}

		this.timeMs = Canvas.method310(); // L: 266
	} // L: 267

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Lba;IB)V",
		garbageValue = "45"
	)
	final void method781(PcmStream var1, int var2) {
		int var3 = var2 >> 5; // L: 276
		PcmStream var4 = this.field281[var3]; // L: 277
		if (var4 == null) { // L: 278
			this.field280[var3] = var1;
		} else {
			var4.after = var1; // L: 279
		}

		this.field281[var3] = var1; // L: 280
		var1.field337 = var2; // L: 281
	} // L: 282

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ILdk;ZI)I",
		garbageValue = "1896673042"
	)
	static int method821(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? Interpreter.scriptDotWidget : HealthBarUpdate.field1223; // L: 1568
		if (var0 == ScriptOpcodes.CC_GETTARGETMASK) { // L: 1569
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = class316.Widget_unpackTargetMask(class209.getWidgetFlags(var3)); // L: 1570
			return 1; // L: 1571
		} else if (var0 != ScriptOpcodes.CC_GETOP) { // L: 1573
			if (var0 == ScriptOpcodes.CC_GETOPBASE) { // L: 1580
				if (var3.dataText == null) { // L: 1581
					Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var3.dataText; // L: 1582
				}

				return 1; // L: 1583
			} else {
				return 2; // L: 1585
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 1574
			--var4; // L: 1575
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) { // L: 1576
				Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var3.actions[var4]; // L: 1577
			} else {
				Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = "";
			}

			return 1; // L: 1578
		}
	}

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "(ZLtn;I)V",
		garbageValue = "233553405"
	)
	@Export("loadRegions")
	static final void loadRegions(boolean var0, PacketBuffer var1) {
		Client.isInInstance = var0; // L: 5755
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		if (!Client.isInInstance) { // L: 5756
			int var2 = var1.method9006(); // L: 5757
			var3 = var1.method9007(); // L: 5758
			var4 = var1.readUnsignedShort(); // L: 5759
			class25.xteaKeys = new int[var4][4]; // L: 5760

			for (var5 = 0; var5 < var4; ++var5) { // L: 5761
				for (var6 = 0; var6 < 4; ++var6) { // L: 5762
					class25.xteaKeys[var5][var6] = var1.readInt(); // L: 5763
				}
			}

			class304.regions = new int[var4]; // L: 5766
			class7.regionMapArchiveIds = new int[var4]; // L: 5767
			WorldMapIcon_1.regionLandArchiveIds = new int[var4]; // L: 5768
			InterfaceParent.regionLandArchives = new byte[var4][]; // L: 5769
			PlayerType.regionMapArchives = new byte[var4][]; // L: 5770
			var4 = 0; // L: 5771

			for (var5 = (var3 - 6) / 8; var5 <= (var3 + 6) / 8; ++var5) { // L: 5772
				for (var6 = (var2 - 6) / 8; var6 <= (var2 + 6) / 8; ++var6) { // L: 5773
					var7 = var6 + (var5 << 8); // L: 5774
					class304.regions[var4] = var7; // L: 5775
					class7.regionMapArchiveIds[var4] = ModelData0.archive9.getGroupId("m" + var5 + "_" + var6); // L: 5776
					WorldMapIcon_1.regionLandArchiveIds[var4] = ModelData0.archive9.getGroupId("l" + var5 + "_" + var6); // L: 5777
					++var4; // L: 5778
				}
			}

			ModeWhere.method6945(var3, var2, true); // L: 5781
		} else {
			boolean var15 = var1.readUnsignedByte() == 1; // L: 5784
			var3 = var1.method9007(); // L: 5785
			var4 = var1.method9006(); // L: 5786
			var5 = var1.readUnsignedShort(); // L: 5787
			var1.importIndex(); // L: 5788

			int var8;
			int var9;
			for (var6 = 0; var6 < 4; ++var6) { // L: 5789
				for (var7 = 0; var7 < 13; ++var7) { // L: 5790
					for (var8 = 0; var8 < 13; ++var8) { // L: 5791
						var9 = var1.readBits(1); // L: 5792
						if (var9 == 1) {
							Client.instanceChunkTemplates[var6][var7][var8] = var1.readBits(26); // L: 5793
						} else {
							Client.instanceChunkTemplates[var6][var7][var8] = -1; // L: 5794
						}
					}
				}
			}

			var1.exportIndex(); // L: 5798
			class25.xteaKeys = new int[var5][4]; // L: 5799

			for (var6 = 0; var6 < var5; ++var6) { // L: 5800
				for (var7 = 0; var7 < 4; ++var7) { // L: 5801
					class25.xteaKeys[var6][var7] = var1.readInt(); // L: 5802
				}
			}

			class304.regions = new int[var5]; // L: 5805
			class7.regionMapArchiveIds = new int[var5]; // L: 5806
			WorldMapIcon_1.regionLandArchiveIds = new int[var5]; // L: 5807
			InterfaceParent.regionLandArchives = new byte[var5][]; // L: 5808
			PlayerType.regionMapArchives = new byte[var5][]; // L: 5809
			var5 = 0; // L: 5810

			for (var6 = 0; var6 < 4; ++var6) { // L: 5811
				for (var7 = 0; var7 < 13; ++var7) { // L: 5812
					for (var8 = 0; var8 < 13; ++var8) { // L: 5813
						var9 = Client.instanceChunkTemplates[var6][var7][var8]; // L: 5814
						if (var9 != -1) { // L: 5815
							int var10 = var9 >> 14 & 1023; // L: 5816
							int var11 = var9 >> 3 & 2047; // L: 5817
							int var12 = (var10 / 8 << 8) + var11 / 8; // L: 5818

							int var13;
							for (var13 = 0; var13 < var5; ++var13) { // L: 5819
								if (class304.regions[var13] == var12) {
									var12 = -1; // L: 5820
									break;
								}
							}

							if (var12 != -1) { // L: 5823
								class304.regions[var5] = var12; // L: 5824
								var13 = var12 >> 8 & 255; // L: 5825
								int var14 = var12 & 255; // L: 5826
								class7.regionMapArchiveIds[var5] = ModelData0.archive9.getGroupId("m" + var13 + "_" + var14); // L: 5827
								WorldMapIcon_1.regionLandArchiveIds[var5] = ModelData0.archive9.getGroupId("l" + var13 + "_" + var14); // L: 5828
								++var5; // L: 5829
							}
						}
					}
				}
			}

			ModeWhere.method6945(var4, var3, !var15); // L: 5835
		}

	} // L: 5837
}

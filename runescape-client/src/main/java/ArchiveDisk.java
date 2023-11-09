import java.io.EOFException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oi")
@Implements("ArchiveDisk")
public final class ArchiveDisk {
	@ObfuscatedName("f")
	@Export("ArchiveDisk_buffer")
	static byte[] ArchiveDisk_buffer;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	@Export("datFile")
	BufferedFile datFile;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	@Export("idxFile")
	BufferedFile idxFile;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1833513533
	)
	@Export("archive")
	int archive;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1683810535
	)
	@Export("maxEntrySize")
	int maxEntrySize;

	static {
		ArchiveDisk_buffer = new byte[520]; // L: 7
	}

	@ObfuscatedSignature(
		descriptor = "(ILqp;Lqp;I)V"
	)
	public ArchiveDisk(int var1, BufferedFile var2, BufferedFile var3, int var4) {
		this.datFile = null; // L: 8
		this.idxFile = null; // L: 9
		this.maxEntrySize = 65000; // L: 11
		this.archive = var1; // L: 14
		this.datFile = var2; // L: 15
		this.idxFile = var3; // L: 16
		this.maxEntrySize = var4; // L: 17
	} // L: 18

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "105987201"
	)
	@Export("read")
	public byte[] read(int var1) {
		synchronized(this.datFile) { // L: 21
			try {
				Object var10000;
				if (this.idxFile.length() < (long)(var1 * 6 + 6)) { // L: 23
					var10000 = null;
					return (byte[])var10000;
				} else {
					this.idxFile.seek((long)(var1 * 6)); // L: 24
					this.idxFile.read(ArchiveDisk_buffer, 0, 6); // L: 25
					int var3 = ((ArchiveDisk_buffer[0] & 255) << 16) + (ArchiveDisk_buffer[2] & 255) + ((ArchiveDisk_buffer[1] & 255) << 8); // L: 26
					int var4 = (ArchiveDisk_buffer[5] & 255) + ((ArchiveDisk_buffer[3] & 255) << 16) + ((ArchiveDisk_buffer[4] & 255) << 8); // L: 27
					if (var3 < 0 || var3 > this.maxEntrySize) { // L: 28
						var10000 = null;
						return (byte[])var10000;
					} else if (var4 <= 0 || (long)var4 > this.datFile.length() / 520L) { // L: 29
						var10000 = null;
						return (byte[])var10000;
					} else {
						byte[] var5 = new byte[var3]; // L: 30
						int var6 = 0; // L: 31

						for (int var7 = 0; var6 < var3; ++var7) { // L: 32 33 65
							if (var4 == 0) { // L: 34
								var10000 = null;
								return (byte[])var10000;
							}

							this.datFile.seek(520L * (long)var4); // L: 35
							int var8 = var3 - var6; // L: 36
							int var9;
							int var10;
							int var11;
							int var12;
							byte var13;
							if (var1 > 65535) { // L: 42
								if (var8 > 510) { // L: 43
									var8 = 510;
								}

								var13 = 10; // L: 44
								this.datFile.read(ArchiveDisk_buffer, 0, var8 + var13); // L: 45
								var9 = ((ArchiveDisk_buffer[1] & 255) << 16) + ((ArchiveDisk_buffer[0] & 255) << 24) + (ArchiveDisk_buffer[3] & 255) + ((ArchiveDisk_buffer[2] & 255) << 8); // L: 46
								var10 = (ArchiveDisk_buffer[5] & 255) + ((ArchiveDisk_buffer[4] & 255) << 8); // L: 47
								var11 = (ArchiveDisk_buffer[8] & 255) + ((ArchiveDisk_buffer[7] & 255) << 8) + ((ArchiveDisk_buffer[6] & 255) << 16); // L: 48
								var12 = ArchiveDisk_buffer[9] & 255; // L: 49
							} else {
								if (var8 > 512) { // L: 52
									var8 = 512;
								}

								var13 = 8; // L: 53
								this.datFile.read(ArchiveDisk_buffer, 0, var8 + var13); // L: 54
								var9 = (ArchiveDisk_buffer[1] & 255) + ((ArchiveDisk_buffer[0] & 255) << 8); // L: 55
								var10 = (ArchiveDisk_buffer[3] & 255) + ((ArchiveDisk_buffer[2] & 255) << 8); // L: 56
								var11 = ((ArchiveDisk_buffer[5] & 255) << 8) + ((ArchiveDisk_buffer[4] & 255) << 16) + (ArchiveDisk_buffer[6] & 255); // L: 57
								var12 = ArchiveDisk_buffer[7] & 255; // L: 58
							}

							if (var9 != var1 || var10 != var7 || var12 != this.archive) { // L: 60
								var10000 = null;
								return (byte[])var10000;
							}

							if (var11 < 0 || (long)var11 > this.datFile.length() / 520L) { // L: 61
								var10000 = null;
								return (byte[])var10000;
							}

							int var14 = var13 + var8; // L: 62

							for (int var15 = var13; var15 < var14; ++var15) { // L: 63
								var5[var6++] = ArchiveDisk_buffer[var15];
							}

							var4 = var11; // L: 64
						}

						byte[] var20 = var5;
						return var20; // L: 67
					}
				}
			} catch (IOException var18) { // L: 69
				return null; // L: 70
			}
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I[BIB)Z",
		garbageValue = "-11"
	)
	@Export("write")
	public boolean write(int var1, byte[] var2, int var3) {
		synchronized(this.datFile) { // L: 76
			if (var3 >= 0 && var3 <= this.maxEntrySize) { // L: 77
				boolean var5 = this.write0(var1, var2, var3, true); // L: 80
				if (!var5) {
					var5 = this.write0(var1, var2, var3, false); // L: 81
				}

				return var5; // L: 82
			} else {
				throw new IllegalArgumentException("" + this.archive + ',' + var1 + ',' + var3); // L: 78
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I[BIZI)Z",
		garbageValue = "1815008195"
	)
	@Export("write0")
	boolean write0(int var1, byte[] var2, int var3, boolean var4) {
		synchronized(this.datFile) { // L: 87
			try {
				int var6;
				boolean var10000;
				if (var4) { // L: 90
					if (this.idxFile.length() < (long)(var1 * 6 + 6)) { // L: 91
						var10000 = false;
						return var10000;
					}

					this.idxFile.seek((long)(var1 * 6)); // L: 92
					this.idxFile.read(ArchiveDisk_buffer, 0, 6); // L: 93
					var6 = (ArchiveDisk_buffer[5] & 255) + ((ArchiveDisk_buffer[3] & 255) << 16) + ((ArchiveDisk_buffer[4] & 255) << 8); // L: 94
					if (var6 <= 0 || (long)var6 > this.datFile.length() / 520L) { // L: 95
						var10000 = false;
						return var10000;
					}
				} else {
					var6 = (int)((this.datFile.length() + 519L) / 520L); // L: 98
					if (var6 == 0) { // L: 99
						var6 = 1;
					}
				}

				ArchiveDisk_buffer[0] = (byte)(var3 >> 16); // L: 101
				ArchiveDisk_buffer[1] = (byte)(var3 >> 8); // L: 102
				ArchiveDisk_buffer[2] = (byte)var3; // L: 103
				ArchiveDisk_buffer[3] = (byte)(var6 >> 16); // L: 104
				ArchiveDisk_buffer[4] = (byte)(var6 >> 8); // L: 105
				ArchiveDisk_buffer[5] = (byte)var6; // L: 106
				this.idxFile.seek((long)(var1 * 6)); // L: 107
				this.idxFile.write(ArchiveDisk_buffer, 0, 6); // L: 108
				int var7 = 0; // L: 109
				int var8 = 0; // L: 110

				while (true) {
					if (var7 < var3) { // L: 111
						label170: {
							int var9 = 0; // L: 112
							int var10;
							if (var4) { // L: 113
								this.datFile.seek((long)var6 * 520L); // L: 114
								int var11;
								int var12;
								if (var1 > 65535) { // L: 118
									try {
										this.datFile.read(ArchiveDisk_buffer, 0, 10); // L: 120
									} catch (EOFException var17) { // L: 122
										break label170; // L: 123
									}

									var10 = ((ArchiveDisk_buffer[1] & 255) << 16) + ((ArchiveDisk_buffer[0] & 255) << 24) + (ArchiveDisk_buffer[3] & 255) + ((ArchiveDisk_buffer[2] & 255) << 8); // L: 125
									var11 = (ArchiveDisk_buffer[5] & 255) + ((ArchiveDisk_buffer[4] & 255) << 8); // L: 126
									var9 = (ArchiveDisk_buffer[8] & 255) + ((ArchiveDisk_buffer[7] & 255) << 8) + ((ArchiveDisk_buffer[6] & 255) << 16); // L: 127
									var12 = ArchiveDisk_buffer[9] & 255; // L: 128
								} else {
									try {
										this.datFile.read(ArchiveDisk_buffer, 0, 8); // L: 132
									} catch (EOFException var16) { // L: 134
										break label170; // L: 135
									}

									var10 = (ArchiveDisk_buffer[1] & 255) + ((ArchiveDisk_buffer[0] & 255) << 8); // L: 137
									var11 = (ArchiveDisk_buffer[3] & 255) + ((ArchiveDisk_buffer[2] & 255) << 8); // L: 138
									var9 = ((ArchiveDisk_buffer[5] & 255) << 8) + ((ArchiveDisk_buffer[4] & 255) << 16) + (ArchiveDisk_buffer[6] & 255); // L: 139
									var12 = ArchiveDisk_buffer[7] & 255; // L: 140
								}

								if (var10 != var1 || var11 != var8 || var12 != this.archive) { // L: 142
									var10000 = false;
									return var10000;
								}

								if (var9 < 0 || (long)var9 > this.datFile.length() / 520L) { // L: 143
									var10000 = false;
									return var10000;
								}
							}

							if (var9 == 0) { // L: 145
								var4 = false; // L: 146
								var9 = (int)((this.datFile.length() + 519L) / 520L); // L: 147
								if (var9 == 0) { // L: 148
									++var9;
								}

								if (var9 == var6) { // L: 149
									++var9;
								}
							}

							if (var1 > 65535) { // L: 151
								if (var3 - var7 <= 510) { // L: 152
									var9 = 0;
								}

								ArchiveDisk_buffer[0] = (byte)(var1 >> 24); // L: 153
								ArchiveDisk_buffer[1] = (byte)(var1 >> 16); // L: 154
								ArchiveDisk_buffer[2] = (byte)(var1 >> 8); // L: 155
								ArchiveDisk_buffer[3] = (byte)var1; // L: 156
								ArchiveDisk_buffer[4] = (byte)(var8 >> 8); // L: 157
								ArchiveDisk_buffer[5] = (byte)var8; // L: 158
								ArchiveDisk_buffer[6] = (byte)(var9 >> 16); // L: 159
								ArchiveDisk_buffer[7] = (byte)(var9 >> 8); // L: 160
								ArchiveDisk_buffer[8] = (byte)var9; // L: 161
								ArchiveDisk_buffer[9] = (byte)this.archive; // L: 162
								this.datFile.seek(520L * (long)var6); // L: 163
								this.datFile.write(ArchiveDisk_buffer, 0, 10); // L: 164
								var10 = var3 - var7; // L: 165
								if (var10 > 510) { // L: 166
									var10 = 510;
								}

								this.datFile.write(var2, var7, var10); // L: 167
								var7 += var10; // L: 168
							} else {
								if (var3 - var7 <= 512) { // L: 171
									var9 = 0;
								}

								ArchiveDisk_buffer[0] = (byte)(var1 >> 8); // L: 172
								ArchiveDisk_buffer[1] = (byte)var1; // L: 173
								ArchiveDisk_buffer[2] = (byte)(var8 >> 8); // L: 174
								ArchiveDisk_buffer[3] = (byte)var8; // L: 175
								ArchiveDisk_buffer[4] = (byte)(var9 >> 16); // L: 176
								ArchiveDisk_buffer[5] = (byte)(var9 >> 8); // L: 177
								ArchiveDisk_buffer[6] = (byte)var9; // L: 178
								ArchiveDisk_buffer[7] = (byte)this.archive; // L: 179
								this.datFile.seek((long)var6 * 520L); // L: 180
								this.datFile.write(ArchiveDisk_buffer, 0, 8); // L: 181
								var10 = var3 - var7; // L: 182
								if (var10 > 512) { // L: 183
									var10 = 512;
								}

								this.datFile.write(var2, var7, var10); // L: 184
								var7 += var10; // L: 185
							}

							var6 = var9; // L: 187
							++var8; // L: 188
							continue; // L: 189
						}
					}

					var10000 = true; // L: 190
					return var10000;
				}
			} catch (IOException var18) { // L: 192
				return false; // L: 193
			}
		}
	}

	public String toString() {
		return "" + this.archive; // L: 198
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZB)I",
		garbageValue = "3"
	)
	static int method7835(int var0, Script var1, boolean var2) {
		int var3;
		Object var4;
		int var5;
		class467 var6;
		int var7;
		if (var0 != 7500 && var0 != 7508) { // L: 4943
			if (var0 != 7501) { // L: 4965
				int var19;
				int var20;
				if (var0 == 7502) { // L: 4974
					class302.Interpreter_intStackSize -= 3; // L: 4975
					var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 4976
					var19 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 4977
					var5 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 2]; // L: 4978
					var20 = WorldMapLabelSize.method4893(var19); // L: 4979
					var7 = MidiPcmStream.method5728(var19); // L: 4980
					int var21 = WorldMapIcon_0.method5265(var19); // L: 4981
					class468 var26 = Ignored.method7740(var3); // L: 4982
					class466 var27 = ClientPacket.method5539(var20); // L: 4983
					int[] var28 = var27.field4907[var7]; // L: 4984
					int var12 = 0; // L: 4985
					int var13 = var28.length; // L: 4986
					if (var21 >= 0) { // L: 4987
						if (var21 >= var13) { // L: 4988
							throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var21 + ", Max: " + var13); // L: 4989
						}

						var12 = var21; // L: 4991
						var13 = var21 + 1; // L: 4992
					}

					Object[] var14 = var26.method8569(var7); // L: 4994
					if (var14 == null && var27.field4909 != null) { // L: 4995 4996
						var14 = var27.field4909[var7];
					}

					int var15;
					int var16;
					if (var14 == null) { // L: 4998
						for (var15 = var12; var15 < var13; ++var15) { // L: 4999
							var16 = var28[var15]; // L: 5000
							class463 var22 = class370.method7047(var16); // L: 5001
							if (var22 == class463.field4903) { // L: 5002
								Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = "";
							} else {
								Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = class370.method7065(var16); // L: 5003
							}
						}

						return 1; // L: 5005
					} else {
						var15 = var14.length / var28.length; // L: 5007
						if (var5 >= 0 && var5 < var15) { // L: 5008
							for (var16 = var12; var16 < var13; ++var16) { // L: 5011
								int var17 = var16 + var28.length * var5; // L: 5012
								class463 var18 = class370.method7047(var28[var16]); // L: 5013
								if (var18 == class463.field4903) { // L: 5014
									Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = (String)var14[var17];
								} else {
									Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = (Integer)var14[var17]; // L: 5015
								}
							}

							return 1; // L: 5017
						} else {
							throw new RuntimeException(); // L: 5009
						}
					}
				} else if (var0 == 7503) { // L: 5019
					class302.Interpreter_intStackSize -= 2; // L: 5020
					var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 5021
					var19 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 5022
					var5 = 0; // L: 5023
					var20 = WorldMapLabelSize.method4893(var19); // L: 5024
					var7 = MidiPcmStream.method5728(var19); // L: 5025
					class468 var25 = Ignored.method7740(var3); // L: 5026
					class466 var9 = ClientPacket.method5539(var20); // L: 5027
					int[] var10 = var9.field4907[var7]; // L: 5028
					Object[] var11 = var25.method8569(var7); // L: 5029
					if (var11 == null && var9.field4909 != null) { // L: 5030 5031
						var11 = var9.field4909[var7]; // L: 5032
					}

					if (var11 != null) { // L: 5035
						var5 = var11.length / var10.length;
					}

					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var5; // L: 5036
					return 1; // L: 5037
				} else if (var0 != 7504 && var0 != 7510) { // L: 5039
					if (var0 == 7505) { // L: 5056
						var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 5057
						class468 var24 = Ignored.method7740(var3); // L: 5058
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var24.field4920; // L: 5059
						return 1; // L: 5060
					} else if (var0 == 7506) { // L: 5062
						var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 5063
						var19 = -1; // L: 5064
						if (Skeleton.field2521 != null && var3 >= 0 && var3 < Skeleton.field2521.size()) { // L: 5065
							var19 = (Integer)Skeleton.field2521.get(var3); // L: 5066
						}

						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var19; // L: 5068
						return 1; // L: 5069
					} else if (var0 != 7507 && var0 != 7509) { // L: 5071
						return 2; // L: 5098
					} else {
						var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 5072
						var4 = Client.method1773(var3); // L: 5073
						var5 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 5074
						var6 = Tiles.method2276(var5); // L: 5075
						if (var6 == null) { // L: 5076
							throw new RuntimeException(); // L: 5077
						} else if (WorldMapLabelSize.method4893(var5) != Client.field777) { // L: 5079
							throw new RuntimeException(); // L: 5080
						} else if (Skeleton.field2521 == null && Skeleton.field2521.isEmpty()) { // L: 5082
							throw new RuntimeException(); // L: 5083
						} else {
							var7 = WorldMapIcon_0.method5265(var5); // L: 5085
							List var8 = var6.method8548(var4, var7); // L: 5086
							Skeleton.field2521 = new LinkedList(Skeleton.field2521); // L: 5087
							if (var8 != null) { // L: 5088
								Skeleton.field2521.retainAll(var8); // L: 5089
							} else {
								Skeleton.field2521.clear(); // L: 5092
							}

							Canvas.field139 = Skeleton.field2521.iterator(); // L: 5094
							if (var0 == 7507) { // L: 5095
								Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Skeleton.field2521.size();
							}

							return 1; // L: 5096
						}
					}
				} else {
					--class302.Interpreter_intStackSize; // L: 5040
					var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 5041
					class467 var23 = Clock.method3566(var3); // L: 5042
					if (var23 == null) { // L: 5043
						throw new RuntimeException(); // L: 5044
					} else {
						Skeleton.field2521 = var23.method8548(0, 0); // L: 5046
						var5 = 0; // L: 5047
						if (Skeleton.field2521 != null) { // L: 5048
							Client.field777 = var3; // L: 5049
							Canvas.field139 = Skeleton.field2521.iterator(); // L: 5050
							var5 = Skeleton.field2521.size(); // L: 5051
						}

						if (var0 == 7504) { // L: 5053
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var5;
						}

						return 1; // L: 5054
					}
				}
			} else {
				if (Canvas.field139 != null && Canvas.field139.hasNext()) { // L: 4966
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = (Integer)Canvas.field139.next(); // L: 4967
				} else {
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1; // L: 4970
				}

				return 1; // L: 4972
			}
		} else {
			var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 4944
			var4 = Client.method1773(var3); // L: 4945
			var5 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 4946
			var6 = Tiles.method2276(var5); // L: 4947
			if (var6 == null) { // L: 4948
				throw new RuntimeException(); // L: 4949
			} else {
				var7 = WorldMapIcon_0.method5265(var5); // L: 4951
				Skeleton.field2521 = var6.method8548(var4, var7); // L: 4952
				if (Skeleton.field2521 != null) { // L: 4953
					Client.field777 = WorldMapLabelSize.method4893(var5); // L: 4954
					Canvas.field139 = Skeleton.field2521.iterator(); // L: 4955
					if (var0 == 7500) { // L: 4956
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Skeleton.field2521.size();
					}
				} else {
					Client.field777 = -1; // L: 4959
					Canvas.field139 = null; // L: 4960
					if (var0 == 7500) { // L: 4961
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
					}
				}

				return 1; // L: 4963
			}
		}
	}

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "197"
	)
	static final boolean method7839(int var0) {
		if (var0 < 0) { // L: 9387
			return false;
		} else {
			int var1 = Client.menuOpcodes[var0]; // L: 9388
			if (var1 >= 2000) { // L: 9389
				var1 -= 2000;
			}

			return var1 == 1007; // L: 9390
		}
	}
}

import java.io.EOFException;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nk")
@Implements("ArchiveDisk")
public final class ArchiveDisk {
	@ObfuscatedName("s")
	@Export("ArchiveDisk_buffer")
	static byte[] ArchiveDisk_buffer;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	@Export("datFile")
	BufferedFile datFile;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	@Export("idxFile")
	BufferedFile idxFile;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1863173991
	)
	@Export("archive")
	int archive;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1536954985
	)
	@Export("maxEntrySize")
	int maxEntrySize;

	static {
		ArchiveDisk_buffer = new byte[520]; // L: 7
	}

	@ObfuscatedSignature(
		descriptor = "(ILpf;Lpf;I)V"
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

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "-1926872003"
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
						int var7 = 0;

						while (var6 < var3) {
							if (var4 == 0) {
								var10000 = null;
								return (byte[])var10000;
							}

							this.datFile.seek((long)var4 * 520L);
							int var8 = var3 - var6;
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

							if (var9 == var1 && var7 == var10 && var12 == this.archive) { // L: 60
								if (var11 >= 0 && (long)var11 <= this.datFile.length() / 520L) { // L: 61
									int var14 = var13 + var8; // L: 62

									for (int var15 = var13; var15 < var14; ++var15) { // L: 63
										var5[var6++] = ArchiveDisk_buffer[var15];
									}

									var4 = var11; // L: 64
									++var7; // L: 65
									continue; // L: 66
								}

								var10000 = null;
								return (byte[])var10000;
							}

							var10000 = null;
							return (byte[])var10000;
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

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I[BII)Z",
		garbageValue = "-2068211733"
	)
	@Export("write")
	public boolean write(int var1, byte[] var2, int var3) {
		synchronized(this.datFile) { // L: 76
			if (var3 >= 0 && var3 <= this.maxEntrySize) { // L: 77
				boolean var5 = this.write0(var1, var2, var3, true); // L: 80
				if (!var5) { // L: 81
					var5 = this.write0(var1, var2, var3, false);
				}

				return var5; // L: 82
			} else {
				throw new IllegalArgumentException("" + this.archive + ',' + var1 + ',' + var3); // L: 78
			}
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I[BIZB)Z",
		garbageValue = "0"
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
						label168: {
							int var9 = 0; // L: 112
							int var10;
							if (var4) { // L: 113
								this.datFile.seek(520L * (long)var6); // L: 114
								int var11;
								int var12;
								if (var1 > 65535) { // L: 118
									try {
										this.datFile.read(ArchiveDisk_buffer, 0, 10); // L: 120
									} catch (EOFException var17) { // L: 122
										break label168; // L: 123
									}

									var10 = ((ArchiveDisk_buffer[1] & 255) << 16) + ((ArchiveDisk_buffer[0] & 255) << 24) + (ArchiveDisk_buffer[3] & 255) + ((ArchiveDisk_buffer[2] & 255) << 8); // L: 125
									var11 = (ArchiveDisk_buffer[5] & 255) + ((ArchiveDisk_buffer[4] & 255) << 8); // L: 126
									var9 = (ArchiveDisk_buffer[8] & 255) + ((ArchiveDisk_buffer[7] & 255) << 8) + ((ArchiveDisk_buffer[6] & 255) << 16); // L: 127
									var12 = ArchiveDisk_buffer[9] & 255; // L: 128
								} else {
									try {
										this.datFile.read(ArchiveDisk_buffer, 0, 8); // L: 132
									} catch (EOFException var16) { // L: 134
										break label168; // L: 135
									}

									var10 = (ArchiveDisk_buffer[1] & 255) + ((ArchiveDisk_buffer[0] & 255) << 8); // L: 137
									var11 = (ArchiveDisk_buffer[3] & 255) + ((ArchiveDisk_buffer[2] & 255) << 8); // L: 138
									var9 = ((ArchiveDisk_buffer[5] & 255) << 8) + ((ArchiveDisk_buffer[4] & 255) << 16) + (ArchiveDisk_buffer[6] & 255); // L: 139
									var12 = ArchiveDisk_buffer[7] & 255; // L: 140
								}

								if (var10 != var1 || var8 != var11 || var12 != this.archive) { // L: 142
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

								if (var6 == var9) { // L: 149
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
								this.datFile.seek((long)var6 * 520L); // L: 163
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
								ArchiveDisk_buffer[5] = (byte)(var9 >> 8);
								ArchiveDisk_buffer[6] = (byte)var9;
								ArchiveDisk_buffer[7] = (byte)this.archive; // L: 179
								this.datFile.seek((long)var6 * 520L);
								this.datFile.write(ArchiveDisk_buffer, 0, 8);
								var10 = var3 - var7; // L: 182
								if (var10 > 512) {
									var10 = 512;
								}

								this.datFile.write(var2, var7, var10);
								var7 += var10; // L: 185
							}

							var6 = var9;
							++var8;
							continue;
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

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)Lfh;",
		garbageValue = "-2136725647"
	)
	@Export("SpotAnimationDefinition_get")
	public static SpotAnimationDefinition SpotAnimationDefinition_get(int var0) {
		SpotAnimationDefinition var1 = (SpotAnimationDefinition)SpotAnimationDefinition.SpotAnimationDefinition_cached.get((long)var0); // L: 32
		if (var1 != null) { // L: 33
			return var1;
		} else {
			byte[] var2 = SpotAnimationDefinition.SpotAnimationDefinition_archive.takeFile(13, var0); // L: 34
			var1 = new SpotAnimationDefinition(); // L: 35
			var1.id = var0; // L: 36
			if (var2 != null) { // L: 37
				var1.decode(new Buffer(var2));
			}

			SpotAnimationDefinition.SpotAnimationDefinition_cached.put(var1, (long)var0); // L: 38
			return var1; // L: 39
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "52"
	)
	static final void method6835(int var0, int var1, int var2) {
		int var3;
		for (var3 = 0; var3 < 8; ++var3) { // L: 177
			for (int var4 = 0; var4 < 8; ++var4) { // L: 178
				Tiles.Tiles_heights[var0][var3 + var1][var4 + var2] = 0;
			}
		}

		if (var1 > 0) { // L: 180
			for (var3 = 1; var3 < 8; ++var3) { // L: 181
				Tiles.Tiles_heights[var0][var1][var3 + var2] = Tiles.Tiles_heights[var0][var1 - 1][var3 + var2];
			}
		}

		if (var2 > 0) { // L: 183
			for (var3 = 1; var3 < 8; ++var3) { // L: 184
				Tiles.Tiles_heights[var0][var3 + var1][var2] = Tiles.Tiles_heights[var0][var3 + var1][var2 - 1];
			}
		}

		if (var1 > 0 && Tiles.Tiles_heights[var0][var1 - 1][var2] != 0) { // L: 186
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1 - 1][var2];
		} else if (var2 > 0 && Tiles.Tiles_heights[var0][var1][var2 - 1] != 0) { // L: 187
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1][var2 - 1];
		} else if (var1 > 0 && var2 > 0 && Tiles.Tiles_heights[var0][var1 - 1][var2 - 1] != 0) {
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1 - 1][var2 - 1]; // L: 188
		}

	} // L: 189

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "-133301813"
	)
	static int method6836(int var0, Script var1, boolean var2) {
		if (var0 != 7000 && var0 != 7005 && var0 != 7010 && var0 != 7015 && var0 != 7020 && var0 != 7025 && var0 != 7030 && var0 != 7035) { // L: 4571
			if (var0 != 7001 && var0 != 7002 && var0 != 7011 && var0 != 7012 && var0 != 7021 && var0 != 7022) { // L: 4575
				if (var0 != 7003 && var0 != 7013 && var0 != 7023) { // L: 4579
					if (var0 != 7006 && var0 != 7007 && var0 != 7016 && var0 != 7017 && var0 != 7026 && var0 != 7027) { // L: 4583
						if (var0 != 7008 && var0 != 7018 && var0 != 7028) { // L: 4587
							if (var0 != 7031 && var0 != 7032) { // L: 4591
								if (var0 == 7033) { // L: 4596
									--UserComparator8.Interpreter_stringStackSize; // L: 4597
									return 1; // L: 4598
								} else if (var0 != 7036 && var0 != 7037) { // L: 4600
									if (var0 == 7038) { // L: 4604
										--Nameable.Interpreter_intStackSize; // L: 4605
										return 1; // L: 4606
									} else if (var0 != 7004 && var0 != 7009 && var0 != 7014 && var0 != 7019 && var0 != 7024 && var0 != 7029 && var0 != 7034 && var0 != 7039) { // L: 4608
										return 2; // L: 4612
									} else {
										--Nameable.Interpreter_intStackSize; // L: 4609
										return 1; // L: 4610
									}
								} else {
									Nameable.Interpreter_intStackSize -= 2; // L: 4601
									return 1; // L: 4602
								}
							} else {
								--UserComparator8.Interpreter_stringStackSize; // L: 4592
								--Nameable.Interpreter_intStackSize; // L: 4593
								return 1; // L: 4594
							}
						} else {
							--Nameable.Interpreter_intStackSize; // L: 4588
							return 1; // L: 4589
						}
					} else {
						Nameable.Interpreter_intStackSize -= 2; // L: 4584
						return 1; // L: 4585
					}
				} else {
					Nameable.Interpreter_intStackSize -= 2; // L: 4580
					return 1; // L: 4581
				}
			} else {
				Nameable.Interpreter_intStackSize -= 3; // L: 4576
				return 1; // L: 4577
			}
		} else {
			Nameable.Interpreter_intStackSize -= 5; // L: 4572
			return 1; // L: 4573
		}
	}
}

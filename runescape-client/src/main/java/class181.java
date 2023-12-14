import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gd")
public class class181 {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;",
		garbageValue = "-820569311"
	)
	static File method3661(String var0, String var1, int var2) {
		String var3 = var2 == 0 ? "" : "" + var2; // L: 124
		JagexCache.JagexCache_locationFile = new File(Login.userHomeDirectory, "jagex_cl_" + var0 + "_" + var1 + var3 + ".dat");
		String var4 = null; // L: 126
		String var5 = null;
		boolean var6 = false;
		Buffer var8;
		int var11;
		File var27;
		if (JagexCache.JagexCache_locationFile.exists()) { // L: 129
			try {
				AccessFile var7 = new AccessFile(JagexCache.JagexCache_locationFile, "rw", 10000L);

				int var9;
				for (var8 = new Buffer((int)var7.length()); var8.offset < var8.array.length; var8.offset += var9) { // L: 134
					var9 = var7.read(var8.array, var8.offset, var8.array.length - var8.offset);
					if (var9 == -1) {
						throw new IOException();
					}
				}

				var8.offset = 0;
				var9 = var8.readUnsignedByte(); // L: 140
				if (var9 < 1 || var9 > 3) {
					throw new IOException("" + var9);
				}

				int var10 = 0;
				if (var9 > 1) {
					var10 = var8.readUnsignedByte();
				}

				if (var9 <= 2) { // L: 144
					var4 = var8.readStringCp1252NullCircumfixed(); // L: 145
					if (var10 == 1) {
						var5 = var8.readStringCp1252NullCircumfixed();
					}
				} else {
					var4 = var8.readCESU8();
					if (var10 == 1) {
						var5 = var8.readCESU8();
					}
				}

				var7.close();
			} catch (IOException var25) { // L: 154
				var25.printStackTrace();
			}

			if (var4 != null) { // L: 157
				var27 = new File(var4); // L: 158
				if (!var27.exists()) { // L: 159
					var4 = null;
				}
			}

			if (var4 != null) {
				var27 = new File(var4, "test.dat"); // L: 164

				boolean var28;
				try {
					RandomAccessFile var15 = new RandomAccessFile(var27, "rw"); // L: 168
					var11 = var15.read();
					var15.seek(0L);
					var15.write(var11); // L: 171
					var15.seek(0L); // L: 172
					var15.close(); // L: 173
					var27.delete(); // L: 174
					var28 = true; // L: 175
				} catch (Exception var23) { // L: 177
					var28 = false; // L: 178
				}

				if (!var28) { // L: 181
					var4 = null; // L: 182
				}
			}
		}

		if (var4 == null && var2 == 0) { // L: 186
			label156:
			for (int var16 = 0; var16 < class85.field1039.length; ++var16) { // L: 187
				for (int var17 = 0; var17 < GameObject.field3091.length; ++var17) { // L: 188
					File var18 = new File(GameObject.field3091[var17] + class85.field1039[var16] + File.separatorChar + var0 + File.separatorChar); // L: 189
					if (var18.exists()) { // L: 190
						File var19 = new File(var18, "test.dat"); // L: 192

						boolean var29;
						try {
							RandomAccessFile var12 = new RandomAccessFile(var19, "rw"); // L: 195
							int var13 = var12.read(); // L: 196
							var12.seek(0L); // L: 197
							var12.write(var13); // L: 198
							var12.seek(0L); // L: 199
							var12.close(); // L: 200
							var19.delete(); // L: 201
							var29 = true; // L: 202
						} catch (Exception var22) { // L: 204
							var29 = false; // L: 205
						}

						if (var29) { // L: 208
							var4 = var18.toString(); // L: 209
							var6 = true; // L: 210
							break label156; // L: 211
						}
					}
				}
			}
		}

		if (var4 == null) { // L: 217
			var4 = Login.userHomeDirectory + File.separatorChar + "jagexcache" + var3 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar; // L: 218
			var6 = true; // L: 219
		}

		File var26;
		if (var5 != null) { // L: 221
			var26 = new File(var5); // L: 222
			var27 = new File(var4); // L: 223

			try {
				File[] var33 = var26.listFiles(); // L: 225
				File[] var31 = var33; // L: 227

				for (var11 = 0; var11 < var31.length; ++var11) { // L: 228
					File var30 = var31[var11]; // L: 229
					File var20 = new File(var27, var30.getName()); // L: 231
					boolean var14 = var30.renameTo(var20); // L: 232
					if (!var14) { // L: 233
						throw new IOException();
					}
				}
			} catch (Exception var24) { // L: 238
				var24.printStackTrace(); // L: 239
			}

			var6 = true; // L: 241
		}

		if (var6) { // L: 243
			var26 = new File(var4); // L: 244
			var8 = null; // L: 245

			try {
				AccessFile var34 = new AccessFile(JagexCache.JagexCache_locationFile, "rw", 10000L); // L: 249
				Buffer var32 = new Buffer(500); // L: 250
				var32.writeByte(3); // L: 251
				var32.writeByte(var8 != null ? 1 : 0); // L: 252
				var32.writeCESU8(var26.getPath()); // L: 253
				if (var8 != null) { // L: 254
					var32.writeCESU8("");
				}

				var34.write(var32.array, 0, var32.offset); // L: 255
				var34.close(); // L: 256
			} catch (IOException var21) { // L: 258
				var21.printStackTrace(); // L: 259
			}
		}

		return new File(var4); // L: 263
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "([Lcr;II[I[II)V",
		garbageValue = "450863022"
	)
	@Export("sortWorlds")
	static void sortWorlds(World[] var0, int var1, int var2, int[] var3, int[] var4) {
		if (var1 < var2) { // L: 82
			int var5 = var1 - 1; // L: 83
			int var6 = var2 + 1; // L: 84
			int var7 = (var2 + var1) / 2; // L: 85
			World var8 = var0[var7]; // L: 86
			var0[var7] = var0[var1]; // L: 87
			var0[var1] = var8; // L: 88

			while (var5 < var6) { // L: 89
				boolean var9 = true; // L: 90

				int var10;
				int var11;
				int var12;
				do {
					--var6; // L: 92

					for (var10 = 0; var10 < 4; ++var10) { // L: 93
						if (var3[var10] == 2) { // L: 96
							var11 = var0[var6].index; // L: 97
							var12 = var8.index; // L: 98
						} else if (var3[var10] == 1) { // L: 100
							var11 = var0[var6].population; // L: 101
							var12 = var8.population; // L: 102
							if (var11 == -1 && var4[var10] == 1) { // L: 103
								var11 = 2001;
							}

							if (var12 == -1 && var4[var10] == 1) { // L: 104
								var12 = 2001;
							}
						} else if (var3[var10] == 3) { // L: 106
							var11 = var0[var6].isMembersOnly() ? 1 : 0; // L: 107
							var12 = var8.isMembersOnly() ? 1 : 0; // L: 108
						} else {
							var11 = var0[var6].id; // L: 111
							var12 = var8.id; // L: 112
						}

						if (var12 != var11) { // L: 114
							if ((var4[var10] != 1 || var11 <= var12) && (var4[var10] != 0 || var11 >= var12)) { // L: 117 118
								var9 = false; // L: 120
							}
							break;
						}

						if (var10 == 3) { // L: 115
							var9 = false;
						}
					}
				} while(var9);

				var9 = true; // L: 125

				do {
					++var5; // L: 127

					for (var10 = 0; var10 < 4; ++var10) { // L: 128
						if (var3[var10] == 2) { // L: 131
							var11 = var0[var5].index; // L: 132
							var12 = var8.index; // L: 133
						} else if (var3[var10] == 1) { // L: 135
							var11 = var0[var5].population; // L: 136
							var12 = var8.population; // L: 137
							if (var11 == -1 && var4[var10] == 1) { // L: 138
								var11 = 2001;
							}

							if (var12 == -1 && var4[var10] == 1) { // L: 139
								var12 = 2001;
							}
						} else if (var3[var10] == 3) { // L: 141
							var11 = var0[var5].isMembersOnly() ? 1 : 0; // L: 142
							var12 = var8.isMembersOnly() ? 1 : 0; // L: 143
						} else {
							var11 = var0[var5].id; // L: 146
							var12 = var8.id; // L: 147
						}

						if (var11 != var12) { // L: 149
							if ((var4[var10] != 1 || var11 >= var12) && (var4[var10] != 0 || var11 <= var12)) { // L: 152 153
								var9 = false; // L: 155
							}
							break;
						}

						if (var10 == 3) { // L: 150
							var9 = false;
						}
					}
				} while(var9);

				if (var5 < var6) { // L: 160
					World var13 = var0[var5]; // L: 161
					var0[var5] = var0[var6]; // L: 162
					var0[var6] = var13; // L: 163
				}
			}

			sortWorlds(var0, var1, var6, var3, var4); // L: 166
			sortWorlds(var0, var6 + 1, var2, var3, var4); // L: 167
		}

	} // L: 169

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "111"
	)
	protected static final int method3656() {
		return GameEngine.field203.method360(); // L: 170
	}
}

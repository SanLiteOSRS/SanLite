import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hm")
@Implements("InvDefinition")
public class InvDefinition extends DualNode {
	@ObfuscatedName("vh")
	@ObfuscatedSignature(
		descriptor = "Lci;"
	)
	@Export("friendSystem")
	public static FriendSystem friendSystem;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("InvDefinition_archive")
	static AbstractArchive InvDefinition_archive;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	@Export("InvDefinition_cached")
	static EvictingDualNodeHashTable InvDefinition_cached;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 596783157
	)
	@Export("size")
	public int size;

	static {
		InvDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	InvDefinition() {
		this.size = 0; // L: 12
	} // L: 14

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lul;I)V",
		garbageValue = "1869609284"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 32
			if (var2 == 0) { // L: 33
				return; // L: 36
			}

			this.decodeNext(var1, var2); // L: 34
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lul;II)V",
		garbageValue = "-570859961"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 2) { // L: 39
			this.size = var1.readUnsignedShort();
		}

	} // L: 41

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IB)Ljava/io/File;",
		garbageValue = "116"
	)
	static File method3617(String var0, String var1, int var2) {
		String var3 = var2 == 0 ? "" : "" + var2; // L: 124
		JagexCache.JagexCache_locationFile = new File(DevicePcmPlayerProvider.userHomeDirectory, "jagex_cl_" + var0 + "_" + var1 + var3 + ".dat"); // L: 125
		String var4 = null; // L: 126
		String var5 = null; // L: 127
		boolean var6 = false; // L: 128
		Buffer var8;
		int var11;
		File var27;
		if (JagexCache.JagexCache_locationFile.exists()) { // L: 129
			try {
				AccessFile var7 = new AccessFile(JagexCache.JagexCache_locationFile, "rw", 10000L); // L: 132

				int var9;
				for (var8 = new Buffer((int)var7.length()); var8.offset < var8.array.length; var8.offset += var9) { // L: 133 134 137
					var9 = var7.read(var8.array, var8.offset, var8.array.length - var8.offset); // L: 135
					if (var9 == -1) { // L: 136
						throw new IOException();
					}
				}

				var8.offset = 0; // L: 139
				var9 = var8.readUnsignedByte(); // L: 140
				if (var9 < 1 || var9 > 3) { // L: 141
					throw new IOException("" + var9);
				}

				int var10 = 0; // L: 142
				if (var9 > 1) { // L: 143
					var10 = var8.readUnsignedByte();
				}

				if (var9 <= 2) { // L: 144
					var4 = var8.readStringCp1252NullCircumfixed(); // L: 145
					if (var10 == 1) { // L: 146
						var5 = var8.readStringCp1252NullCircumfixed();
					}
				} else {
					var4 = var8.readCESU8(); // L: 149
					if (var10 == 1) { // L: 150
						var5 = var8.readCESU8();
					}
				}

				var7.close(); // L: 152
			} catch (IOException var25) { // L: 154
				var25.printStackTrace(); // L: 155
			}

			if (var4 != null) { // L: 157
				var27 = new File(var4); // L: 158
				if (!var27.exists()) { // L: 159
					var4 = null; // L: 160
				}
			}

			if (var4 != null) { // L: 163
				var27 = new File(var4, "test.dat"); // L: 164

				boolean var28;
				try {
					RandomAccessFile var15 = new RandomAccessFile(var27, "rw"); // L: 168
					var11 = var15.read(); // L: 169
					var15.seek(0L); // L: 170
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
			label155:
			for (int var16 = 0; var16 < class27.field147.length; ++var16) { // L: 187
				for (int var17 = 0; var17 < FriendsList.field4675.length; ++var17) { // L: 188
					File var18 = new File(FriendsList.field4675[var17] + class27.field147[var16] + File.separatorChar + var0 + File.separatorChar); // L: 189
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
							break label155; // L: 211
						}
					}
				}
			}
		}

		if (var4 == null) { // L: 217
			var4 = DevicePcmPlayerProvider.userHomeDirectory + File.separatorChar + "jagexcache" + var3 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar; // L: 218
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

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lom;Ljava/lang/String;Ljava/lang/String;S)[Lun;",
		garbageValue = "20693"
	)
	public static IndexedSprite[] method3618(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) { // L: 68
			return null;
		} else {
			int var3 = var0.getGroupId(var1); // L: 69
			int var4 = var0.getFileId(var3, var2); // L: 70
			IndexedSprite[] var5;
			if (!class164.method3376(var0, var3, var4)) { // L: 73
				var5 = null; // L: 74
			} else {
				var5 = class512.method9001(); // L: 77
			}

			return var5; // L: 79
		}
	}
}

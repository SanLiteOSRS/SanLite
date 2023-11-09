import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.Callable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fj")
class class133 implements Callable {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	final class138 this$0;
	// $FF: synthetic field
	final int val$workStart;
	// $FF: synthetic field
	final int val$workEnd;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "[Les;"
	)
	final class129[] val$curveLoadJobs;

	@ObfuscatedSignature(
		descriptor = "(Lfw;II[Les;)V"
	)
	class133(class138 var1, int var2, int var3, class129[] var4) {
		this.this$0 = var1;
		this.val$workStart = var2;
		this.val$workEnd = var3;
		this.val$curveLoadJobs = var4;
	}

	public Object call() {
		for (int var1 = this.val$workStart; var1 < this.val$workEnd; ++var1) {
			this.val$curveLoadJobs[var1].call(); // L: 138
		}

		return null;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;ZI)[B",
		garbageValue = "186544241"
	)
	public static byte[] method3128(Object var0, boolean var1) {
		if (var0 == null) { // L: 21
			return null;
		} else if (var0 instanceof byte[]) { // L: 22
			byte[] var3 = (byte[])((byte[])var0); // L: 23
			return var1 ? class308.method6013(var3) : var3; // L: 24
		} else if (var0 instanceof AbstractByteArrayCopier) { // L: 27
			AbstractByteArrayCopier var2 = (AbstractByteArrayCopier)var0; // L: 28
			return var2.get(); // L: 29
		} else {
			throw new IllegalArgumentException(); // L: 31
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;",
		garbageValue = "-1301255869"
	)
	static File method3127(String var0, String var1, int var2) {
		String var3 = var2 == 0 ? "" : "" + var2; // L: 124
		ItemComposition.JagexCache_locationFile = new File(class388.userHomeDirectory, "jagex_cl_" + var0 + "_" + var1 + var3 + ".dat"); // L: 125
		String var4 = null; // L: 126
		String var5 = null; // L: 127
		boolean var6 = false; // L: 128
		int var11;
		File var26;
		if (ItemComposition.JagexCache_locationFile.exists()) { // L: 129
			try {
				AccessFile var7 = new AccessFile(ItemComposition.JagexCache_locationFile, "rw", 10000L); // L: 132

				Buffer var8;
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
			} catch (IOException var24) { // L: 154
				var24.printStackTrace(); // L: 155
			}

			if (var4 != null) { // L: 157
				var26 = new File(var4); // L: 158
				if (!var26.exists()) { // L: 159
					var4 = null; // L: 160
				}
			}

			if (var4 != null) { // L: 163
				var26 = new File(var4, "test.dat"); // L: 164

				boolean var27;
				try {
					RandomAccessFile var15 = new RandomAccessFile(var26, "rw"); // L: 168
					var11 = var15.read(); // L: 169
					var15.seek(0L); // L: 170
					var15.write(var11); // L: 171
					var15.seek(0L); // L: 172
					var15.close(); // L: 173
					var26.delete(); // L: 174
					var27 = true; // L: 175
				} catch (Exception var22) { // L: 177
					var27 = false; // L: 178
				}

				if (!var27) { // L: 181
					var4 = null; // L: 182
				}
			}
		}

		if (var4 == null && var2 == 0) { // L: 186
			label140:
			for (int var16 = 0; var16 < JagexCache.field1844.length; ++var16) { // L: 187
				for (int var17 = 0; var17 < ArchiveDiskActionHandler.field4241.length; ++var17) { // L: 188
					File var18 = new File(ArchiveDiskActionHandler.field4241[var17] + JagexCache.field1844[var16] + File.separatorChar + var0 + File.separatorChar); // L: 189
					if (var18.exists()) { // L: 190
						File var19 = new File(var18, "test.dat"); // L: 192

						boolean var28;
						try {
							RandomAccessFile var12 = new RandomAccessFile(var19, "rw"); // L: 195
							int var13 = var12.read(); // L: 196
							var12.seek(0L); // L: 197
							var12.write(var13); // L: 198
							var12.seek(0L); // L: 199
							var12.close(); // L: 200
							var19.delete(); // L: 201
							var28 = true; // L: 202
						} catch (Exception var21) { // L: 204
							var28 = false; // L: 205
						}

						if (var28) { // L: 208
							var4 = var18.toString(); // L: 209
							var6 = true; // L: 210
							break label140; // L: 211
						}
					}
				}
			}
		}

		if (var4 == null) { // L: 217
			var4 = class388.userHomeDirectory + File.separatorChar + "jagexcache" + var3 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar; // L: 218
			var6 = true; // L: 219
		}

		if (var5 != null) { // L: 221
			File var25 = new File(var5); // L: 222
			var26 = new File(var4); // L: 223

			try {
				File[] var31 = var25.listFiles(); // L: 225
				File[] var30 = var31; // L: 227

				for (var11 = 0; var11 < var30.length; ++var11) { // L: 228
					File var29 = var30[var11]; // L: 229
					File var20 = new File(var26, var29.getName()); // L: 231
					boolean var14 = var29.renameTo(var20); // L: 232
					if (!var14) { // L: 233
						throw new IOException();
					}
				}
			} catch (Exception var23) { // L: 238
				var23.printStackTrace(); // L: 239
			}

			var6 = true; // L: 241
		}

		if (var6) { // L: 243
			ServerPacket.method5762(new File(var4), (File)null);
		}

		return new File(var4); // L: 244
	}
}

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ma")
public class class331 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	public AbstractArchive field3572;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1618502737
	)
	public int field3573;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1807007735
	)
	public int field3574;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1010038427
	)
	public int field3577;
	@ObfuscatedName("aq")
	public float field3576;
	@ObfuscatedName("ar")
	public boolean field3578;
	@ObfuscatedName("ag")
	public boolean field3575;
	@ObfuscatedName("ao")
	public boolean field3579;
	@ObfuscatedName("ae")
	public boolean field3580;
	@ObfuscatedName("aa")
	boolean field3581;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public MidiPcmStream field3582;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lbi;"
	)
	public SoundCache field3583;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	public MusicTrack field3584;

	@ObfuscatedSignature(
		descriptor = "(Low;Ljava/lang/String;Ljava/lang/String;IZ)V"
	)
	public class331(AbstractArchive var1, String var2, String var3, int var4, boolean var5) {
		this.field3573 = -1;
		this.field3574 = -1;
		this.field3577 = 0;
		this.field3576 = 0.0F;
		this.field3578 = false;
		this.field3580 = false;
		this.field3581 = false;
		this.field3573 = var1.getGroupId(var2); // L: 22
		this.field3574 = var1.getFileId(this.field3573, var3); // L: 23
		this.method6306(var1, this.field3573, this.field3574, var4, var5); // L: 24
	} // L: 25

	@ObfuscatedSignature(
		descriptor = "(Low;IIIZ)V"
	)
	public class331(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		this.field3573 = -1; // L: 8
		this.field3574 = -1; // L: 9
		this.field3577 = 0; // L: 10
		this.field3576 = 0.0F; // L: 11
		this.field3578 = false; // L: 12
		this.field3580 = false; // L: 15
		this.field3581 = false; // L: 16
		this.method6306(var1, var2, var3, var4, var5); // L: 28
	} // L: 29

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Low;IIIZI)V",
		garbageValue = "-2032716005"
	)
	void method6306(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		this.field3572 = var1; // L: 32
		this.field3573 = var2; // L: 33
		this.field3574 = var3; // L: 34
		this.field3577 = var4; // L: 35
		this.field3578 = var5; // L: 36
	} // L: 37

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IB)Ljava/io/File;",
		garbageValue = "122"
	)
	static File method6303(String var0, String var1, int var2) {
		String var3 = var2 == 0 ? "" : "" + var2; // L: 147
		class317.JagexCache_locationFile = new File(RouteStrategy.userHomeDirectory, "jagex_cl_" + var0 + "_" + var1 + var3 + ".dat"); // L: 148
		String var4 = null; // L: 149
		String var5 = null; // L: 150
		boolean var6 = false; // L: 151
		int var11;
		File var26;
		if (class317.JagexCache_locationFile.exists()) { // L: 152
			try {
				AccessFile var7 = new AccessFile(class317.JagexCache_locationFile, "rw", 10000L); // L: 155

				Buffer var8;
				int var9;
				for (var8 = new Buffer((int)var7.length()); var8.offset < var8.array.length; var8.offset += var9) { // L: 156 157 160
					var9 = var7.read(var8.array, var8.offset, var8.array.length - var8.offset); // L: 158
					if (var9 == -1) { // L: 159
						throw new IOException();
					}
				}

				var8.offset = 0; // L: 162
				var9 = var8.readUnsignedByte(); // L: 163
				if (var9 < 1 || var9 > 3) {
					throw new IOException("" + var9); // L: 164
				}

				int var10 = 0; // L: 165
				if (var9 > 1) { // L: 166
					var10 = var8.readUnsignedByte();
				}

				if (var9 <= 2) { // L: 167
					var4 = var8.readStringCp1252NullCircumfixed(); // L: 168
					if (var10 == 1) { // L: 169
						var5 = var8.readStringCp1252NullCircumfixed();
					}
				} else {
					var4 = var8.readCESU8(); // L: 172
					if (var10 == 1) { // L: 173
						var5 = var8.readCESU8();
					}
				}

				var7.close(); // L: 175
			} catch (IOException var24) { // L: 177
				var24.printStackTrace(); // L: 178
			}

			if (var4 != null) { // L: 180
				var26 = new File(var4); // L: 181
				if (!var26.exists()) { // L: 182
					var4 = null; // L: 183
				}
			}

			if (var4 != null) { // L: 186
				var26 = new File(var4, "test.dat"); // L: 187

				boolean var27;
				try {
					RandomAccessFile var15 = new RandomAccessFile(var26, "rw"); // L: 191
					var11 = var15.read(); // L: 192
					var15.seek(0L); // L: 193
					var15.write(var11); // L: 194
					var15.seek(0L); // L: 195
					var15.close(); // L: 196
					var26.delete(); // L: 197
					var27 = true; // L: 198
				} catch (Exception var22) { // L: 200
					var27 = false; // L: 201
				}

				if (!var27) { // L: 204
					var4 = null; // L: 205
				}
			}
		}

		if (var4 == null && var2 == 0) { // L: 209
			label140:
			for (int var16 = 0; var16 < UserComparator3.field1458.length; ++var16) { // L: 210
				for (int var17 = 0; var17 < GrandExchangeOfferOwnWorldComparator.field494.length; ++var17) { // L: 211
					File var18 = new File(GrandExchangeOfferOwnWorldComparator.field494[var17] + UserComparator3.field1458[var16] + File.separatorChar + var0 + File.separatorChar); // L: 212
					if (var18.exists()) { // L: 213
						File var19 = new File(var18, "test.dat"); // L: 215

						boolean var28;
						try {
							RandomAccessFile var12 = new RandomAccessFile(var19, "rw"); // L: 218
							int var13 = var12.read(); // L: 219
							var12.seek(0L); // L: 220
							var12.write(var13); // L: 221
							var12.seek(0L); // L: 222
							var12.close(); // L: 223
							var19.delete(); // L: 224
							var28 = true; // L: 225
						} catch (Exception var21) { // L: 227
							var28 = false; // L: 228
						}

						if (var28) { // L: 231
							var4 = var18.toString(); // L: 232
							var6 = true; // L: 233
							break label140; // L: 234
						}
					}
				}
			}
		}

		if (var4 == null) { // L: 240
			var4 = RouteStrategy.userHomeDirectory + File.separatorChar + "jagexcache" + var3 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar; // L: 241
			var6 = true; // L: 242
		}

		if (var5 != null) { // L: 244
			File var25 = new File(var5); // L: 245
			var26 = new File(var4); // L: 246

			try {
				File[] var31 = var25.listFiles(); // L: 248
				File[] var30 = var31; // L: 250

				for (var11 = 0; var11 < var30.length; ++var11) { // L: 251
					File var29 = var30[var11]; // L: 252
					File var20 = new File(var26, var29.getName()); // L: 254
					boolean var14 = var29.renameTo(var20); // L: 255
					if (!var14) { // L: 256
						throw new IOException();
					}
				}
			} catch (Exception var23) { // L: 261
				var23.printStackTrace(); // L: 262
			}

			var6 = true; // L: 264
		}

		if (var6) { // L: 266
			class148.method3280(new File(var4), (File)null);
		}

		return new File(var4); // L: 267
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "-33"
	)
	static boolean method6302(char var0) {
		for (int var1 = 0; var1 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var1) { // L: 1192
			if (var0 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var1)) {
				return true; // L: 1193
			}
		}

		return false; // L: 1195
	}
}

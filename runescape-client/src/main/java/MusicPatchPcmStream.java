import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hz")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
	@ObfuscatedName("t")
	public static short[][] field2516;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lgv;"
	)
	@Export("superStream")
	MidiPcmStream superStream;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Lja;"
	)
	@Export("queue")
	NodeDeque queue;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "Ldf;"
	)
	@Export("mixer")
	PcmStreamMixer mixer;

	@ObfuscatedSignature(
		signature = "(Lgv;)V"
	)
	MusicPatchPcmStream(MidiPcmStream var1) {
		this.queue = new NodeDeque();
		this.mixer = new PcmStreamMixer();
		this.superStream = var1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lhl;[IIIII)V",
		garbageValue = "1431385490"
	)
	void method4046(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
		if ((this.superStream.field2449[var1.field2479] & 4) != 0 && var1.field2473 < 0) {
			int var6 = this.superStream.field2454[var1.field2479] / PcmPlayer.field1442;

			while (true) {
				int var7 = (var6 + 1048575 - var1.field2484) / var6;
				if (var7 > var4) {
					var1.field2484 += var4 * var6;
					break;
				}

				var1.stream.fill(var2, var3, var7);
				var3 += var7;
				var4 -= var7;
				var1.field2484 += var7 * var6 - 1048576;
				int var8 = PcmPlayer.field1442 / 100;
				int var9 = 262144 / var6;
				if (var9 < var8) {
					var8 = var9;
				}

				RawPcmStream var10 = var1.stream;
				if (this.superStream.field2452[var1.field2479] == 0) {
					var1.stream = RawPcmStream.method2683(var1.rawSound, var10.method2689(), var10.method2680(), var10.method2681());
				} else {
					var1.stream = RawPcmStream.method2683(var1.rawSound, var10.method2689(), 0, var10.method2681());
					this.superStream.method3867(var1, var1.patch.field2504[var1.field2466] < 0);
					var1.stream.method2721(var8, var10.method2680());
				}

				if (var1.patch.field2504[var1.field2466] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var10.method2687(var8);
				var10.fill(var2, var3, var5 - var3);
				if (var10.method2786()) {
					this.mixer.addSubStream(var10);
				}
			}
		}

		var1.stream.fill(var2, var3, var4);
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(Lhl;IB)V",
		garbageValue = "-29"
	)
	void method4047(MusicPatchNode var1, int var2) {
		if ((this.superStream.field2449[var1.field2479] & 4) != 0 && var1.field2473 < 0) {
			int var3 = this.superStream.field2454[var1.field2479] / PcmPlayer.field1442;
			int var4 = (var3 + 1048575 - var1.field2484) / var3;
			var1.field2484 = var3 * var2 + var1.field2484 & 1048575;
			if (var4 <= var2) {
				if (this.superStream.field2452[var1.field2479] == 0) {
					var1.stream = RawPcmStream.method2683(var1.rawSound, var1.stream.method2689(), var1.stream.method2680(), var1.stream.method2681());
				} else {
					var1.stream = RawPcmStream.method2683(var1.rawSound, var1.stream.method2689(), 0, var1.stream.method2681());
					this.superStream.method3867(var1, var1.patch.field2504[var1.field2466] < 0);
				}

				if (var1.patch.field2504[var1.field2466] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var2 = var1.field2484 / var3;
			}
		}

		var1.stream.skip(var2);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "()Lde;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		MusicPatchNode var1 = (MusicPatchNode)this.queue.last();
		if (var1 == null) {
			return null;
		} else {
			return (PcmStream)(var1.stream != null ? var1.stream : this.nextSubStream());
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "()Lde;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		MusicPatchNode var1;
		do {
			var1 = (MusicPatchNode)this.queue.previous();
			if (var1 == null) {
				return null;
			}
		} while(var1.stream == null);

		return var1.stream;
	}

	@ObfuscatedName("c")
	protected int vmethod4043() {
		return 0;
	}

	@ObfuscatedName("u")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		this.mixer.fill(var1, var2, var3);

		for (MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method3889(var6)) {
				int var4 = var2;
				int var5 = var3;

				do {
					if (var5 <= var6.field2483) {
						this.method4046(var6, var1, var4, var5, var4 + var5);
						var6.field2483 -= var5;
						break;
					}

					this.method4046(var6, var1, var4, var6.field2483, var5 + var4);
					var4 += var6.field2483;
					var5 -= var6.field2483;
				} while(!this.superStream.method3877(var6, var1, var4, var5));
			}
		}

	}

	@ObfuscatedName("e")
	@Export("skip")
	protected void skip(int var1) {
		this.mixer.skip(var1);

		for (MusicPatchNode var3 = (MusicPatchNode)this.queue.last(); var3 != null; var3 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method3889(var3)) {
				int var2 = var1;

				do {
					if (var2 <= var3.field2483) {
						this.method4047(var3, var2);
						var3.field2483 -= var2;
						break;
					}

					this.method4047(var3, var3.field2483);
					var2 -= var3.field2483;
				} while(!this.superStream.method3877(var3, (int[])null, 0, var2));
			}
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "1711772520"
	)
	public static void method4041(String var0, String var1, int var2, int var3) throws IOException {
		class297.idxCount = var3;
		AbstractUserComparator.cacheGamebuild = var2;

		try {
			ApproximateRouteStrategy.field642 = System.getProperty("os.name");
		} catch (Exception var32) {
			ApproximateRouteStrategy.field642 = "Unknown";
		}

		MouseRecorder.field617 = ApproximateRouteStrategy.field642.toLowerCase();

		try {
			class52.userHomeDirectory = System.getProperty("user.home");
			if (class52.userHomeDirectory != null) {
				class52.userHomeDirectory = class52.userHomeDirectory + "/";
			}
		} catch (Exception var31) {
		}

		try {
			if (MouseRecorder.field617.startsWith("win")) {
				if (class52.userHomeDirectory == null) {
					class52.userHomeDirectory = System.getenv("USERPROFILE");
				}
			} else if (class52.userHomeDirectory == null) {
				class52.userHomeDirectory = System.getenv("HOME");
			}

			if (class52.userHomeDirectory != null) {
				class52.userHomeDirectory = class52.userHomeDirectory + "/";
			}
		} catch (Exception var30) {
		}

		if (class52.userHomeDirectory == null) {
			class52.userHomeDirectory = "~/";
		}

		GrandExchangeEvents.field68 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", class52.userHomeDirectory, "/tmp/", ""};
		Client.field957 = new String[]{".jagex_cache_" + AbstractUserComparator.cacheGamebuild, ".file_store_" + AbstractUserComparator.cacheGamebuild};
		int var18 = 0;

		label256:
		while (var18 < 4) {
			String var6 = var18 == 0 ? "" : "" + var18;
			class277.JagexCache_locationFile = new File(class52.userHomeDirectory, "jagex_cl_" + var0 + "_" + var1 + var6 + ".dat");
			String var7 = null;
			String var8 = null;
			boolean var9 = false;
			int var12;
			int var14;
			File var37;
			if (class277.JagexCache_locationFile.exists()) {
				try {
					AccessFile var10 = new AccessFile(class277.JagexCache_locationFile, "rw", 10000L);

					Buffer var11;
					for (var11 = new Buffer((int)var10.length()); var11.offset < var11.array.length; var11.offset += var12) {
						var12 = var10.read(var11.array, var11.offset, var11.array.length - var11.offset);
						if (var12 == -1) {
							throw new IOException();
						}
					}

					var11.offset = 0;
					var12 = var11.readUnsignedByte();
					if (var12 < 1 || var12 > 3) {
						throw new IOException("" + var12);
					}

					int var13 = 0;
					if (var12 > 1) {
						var13 = var11.readUnsignedByte();
					}

					if (var12 <= 2) {
						var7 = var11.readStringCp1252NullCircumfixed();
						if (var13 == 1) {
							var8 = var11.readStringCp1252NullCircumfixed();
						}
					} else {
						var7 = var11.readCESU8();
						if (var13 == 1) {
							var8 = var11.readCESU8();
						}
					}

					var10.close();
				} catch (IOException var34) {
					var34.printStackTrace();
				}

				if (var7 != null) {
					var37 = new File(var7);
					if (!var37.exists()) {
						var7 = null;
					}
				}

				if (var7 != null) {
					var37 = new File(var7, "test.dat");

					boolean var40;
					try {
						RandomAccessFile var19 = new RandomAccessFile(var37, "rw");
						var14 = var19.read();
						var19.seek(0L);
						var19.write(var14);
						var19.seek(0L);
						var19.close();
						var37.delete();
						var40 = true;
					} catch (Exception var29) {
						var40 = false;
					}

					if (!var40) {
						var7 = null;
					}
				}
			}

			if (var7 == null && var18 == 0) {
				label230:
				for (int var20 = 0; var20 < Client.field957.length; ++var20) {
					for (int var21 = 0; var21 < GrandExchangeEvents.field68.length; ++var21) {
						File var22 = new File(GrandExchangeEvents.field68[var21] + Client.field957[var20] + File.separatorChar + var0 + File.separatorChar);
						if (var22.exists()) {
							File var23 = new File(var22, "test.dat");

							boolean var41;
							try {
								RandomAccessFile var15 = new RandomAccessFile(var23, "rw");
								int var16 = var15.read();
								var15.seek(0L);
								var15.write(var16);
								var15.seek(0L);
								var15.close();
								var23.delete();
								var41 = true;
							} catch (Exception var28) {
								var41 = false;
							}

							if (var41) {
								var7 = var22.toString();
								var9 = true;
								break label230;
							}
						}
					}
				}
			}

			if (var7 == null) {
				var7 = class52.userHomeDirectory + File.separatorChar + "jagexcache" + var6 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar;
				var9 = true;
			}

			if (var8 != null) {
				File var36 = new File(var8);
				var37 = new File(var7);

				try {
					File[] var45 = var36.listFiles();
					File[] var43 = var45;

					for (var14 = 0; var14 < var43.length; ++var14) {
						File var42 = var43[var14];
						File var24 = new File(var37, var42.getName());
						boolean var17 = var42.renameTo(var24);
						if (!var17) {
							throw new IOException();
						}
					}
				} catch (Exception var33) {
					var33.printStackTrace();
				}

				var9 = true;
			}

			if (var9) {
				SecureRandomCallable.method1237(new File(var7), (File)null);
			}

			File var5 = new File(var7);
			JagexCache.cacheDir = var5;
			if (!JagexCache.cacheDir.exists()) {
				JagexCache.cacheDir.mkdirs();
			}

			File[] var35 = JagexCache.cacheDir.listFiles();
			if (var35 != null) {
				File[] var38 = var35;

				for (int var25 = 0; var25 < var38.length; ++var25) {
					File var26 = var38[var25];

					boolean var44;
					try {
						RandomAccessFile var39 = new RandomAccessFile(var26, "rw");
						var12 = var39.read();
						var39.seek(0L);
						var39.write(var12);
						var39.seek(0L);
						var39.close();
						var44 = true;
					} catch (Exception var27) {
						var44 = false;
					}

					if (!var44) {
						++var18;
						continue label256;
					}
				}
			}
			break;
		}

		MouseHandler.method1177(JagexCache.cacheDir);
		ClientPacket.method3745();
		JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(BuddyRankComparator.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
		JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(BuddyRankComparator.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
		JagexCache.JagexCache_idxFiles = new BufferedFile[class297.idxCount];

		for (var18 = 0; var18 < class297.idxCount; ++var18) {
			JagexCache.JagexCache_idxFiles[var18] = new BufferedFile(new AccessFile(BuddyRankComparator.getFile("main_file_cache.idx" + var18), "rw", 1048576L), 6000, 0);
		}

	}
}

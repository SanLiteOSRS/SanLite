import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("di")
@Implements("UrlRequester")
public abstract class UrlRequester implements Runnable {
	@ObfuscatedName("f")
	final Thread field1410;
	@ObfuscatedName("w")
	@Export("isClosed")
	volatile boolean isClosed;
	@ObfuscatedName("v")
	@Export("requests")
	Queue requests;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 2025768381
	)
	int field1406;

	UrlRequester(int var1) {
		this.requests = new LinkedList(); // L: 16
		this.field1410 = new Thread(this);
		this.field1410.setPriority(1);
		this.field1410.start(); // L: 22
		this.field1406 = var1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ldg;I)V",
		garbageValue = "1626777935"
	)
	abstract void vmethod2875(UrlRequest var1) throws IOException;

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;I)V",
		garbageValue = "1863650112"
	)
	void method2855(URLConnection var1) {
		var1.setConnectTimeout(5000);
		var1.setReadTimeout(5000); // L: 53
		var1.setUseCaches(false);
		var1.setRequestProperty("Connection", "close");
		var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.field1406); // L: 56
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;Ldg;I)V",
		garbageValue = "635566150"
	)
	void method2859(URLConnection var1, UrlRequest var2) {
		DataInputStream var3 = null;

		try {
			int var5 = var1.getContentLength();
			var3 = new DataInputStream(var1.getInputStream());
			byte[] var4;
			if (var5 >= 0) {
				var4 = new byte[var5];
				var3.readFully(var4); // L: 67
			} else {
				var4 = new byte[0];
				byte[] var6 = ClientPacket.ByteArrayPool_getArray(5000); // L: 71

				byte[] var8;
				for (int var7 = var3.read(var6, 0, var6.length); var7 > -1; var4 = var8) { // L: 73 77
					var8 = new byte[var4.length + var7]; // L: 74
					System.arraycopy(var4, 0, var8, 0, var4.length);
					System.arraycopy(var6, 0, var8, var4.length, var7);
				}

				class277.ByteArrayPool_release(var6);
			}

			var2.response0 = var4;
		} catch (IOException var10) {
		}

		if (var3 != null) {
			try {
				var3.close();
			} catch (IOException var9) {
			}
		}

	} // L: 90

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;I)Ldg;",
		garbageValue = "-1293624183"
	)
	@Export("request")
	public UrlRequest request(URL var1) {
		UrlRequest var2 = new UrlRequest(var1);
		synchronized(this) {
			this.requests.add(var2);
			this.notify();
			return var2;
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1651940663"
	)
	@Export("close")
	public void close() {
		this.isClosed = true;

		try {
			synchronized(this) {
				this.notify(); // L: 105
			} // L: 106

			this.field1410.join();
		} catch (InterruptedException var4) {
		}

	} // L: 110

	public void run() {
		while (!this.isClosed) { // L: 28
			try {
				UrlRequest var1;
				synchronized(this) {
					var1 = (UrlRequest)this.requests.poll();
					if (var1 == null) {
						try {
							this.wait();
						} catch (InterruptedException var5) { // L: 37
						}
						continue;
					}
				}

				this.vmethod2875(var1);
			} catch (Exception var7) {
				class121.RunException_sendStackTrace((String)null, var7);
			}
		}

	} // L: 47

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;ZB)Lqr;",
		garbageValue = "9"
	)
	@Export("getPreferencesFile")
	public static AccessFile getPreferencesFile(String var0, String var1, boolean var2) {
		File var3 = new File(Ignored.cacheDir, "preferences" + var0 + ".dat");
		if (var3.exists()) {
			try {
				AccessFile var10 = new AccessFile(var3, "rw", 10000L);
				return var10; // L: 44
			} catch (IOException var9) {
			}
		}

		String var4 = "";
		if (class86.cacheGamebuild == 33) {
			var4 = "_rc";
		} else if (class86.cacheGamebuild == 34) { // L: 50
			var4 = "_wip";
		}

		File var5 = new File(UserComparator4.userHomeDirectory, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat"); // L: 51
		AccessFile var6;
		if (!var2 && var5.exists()) { // L: 52
			try {
				var6 = new AccessFile(var5, "rw", 10000L); // L: 54
				return var6; // L: 55
			} catch (IOException var8) { // L: 57
			}
		}

		try {
			var6 = new AccessFile(var3, "rw", 10000L);
			return var6;
		} catch (IOException var7) {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Lgf;",
		garbageValue = "1042587763"
	)
	@Export("KitDefinition_get")
	public static KitDefinition KitDefinition_get(int var0) {
		KitDefinition var1 = (KitDefinition)KitDefinition.KitDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = KitDefinition.KitDefinition_archive.takeFile(3, var0);
			var1 = new KitDefinition(); // L: 32
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			KitDefinition.KitDefinition_cached.put(var1, (long)var0); // L: 34
			return var1;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lda;FI)F",
		garbageValue = "-1354016584"
	)
	static float method2874(class125 var0, float var1) {
		if (var0 != null && var0.method3060() != 0) { // L: 20
			if (var1 < (float)var0.field1524[0].field1474) { // L: 23
				return var0.field1522 == class123.field1502 ? var0.field1524[0].field1467 : Messages.method2821(var0, var1, true); // L: 24 25 27
			} else if (var1 > (float)var0.field1524[var0.method3060() - 1].field1474) { // L: 29
				return var0.field1541 == class123.field1502 ? var0.field1524[var0.method3060() - 1].field1467 : Messages.method2821(var0, var1, false); // L: 30 31 33
			} else if (var0.field1521) { // L: 35
				return var0.field1524[0].field1467; // L: 36
			} else {
				class120 var2 = var0.method3049(var1); // L: 38
				boolean var3 = false; // L: 39
				boolean var4 = false; // L: 40
				if (var2 == null) { // L: 41
					return 0.0F; // L: 168
				} else {
					if (0.0D == (double)var2.field1473 && 0.0D == (double)var2.field1472) { // L: 42
						var3 = true; // L: 43
					} else if (var2.field1473 == Float.MAX_VALUE && var2.field1472 == Float.MAX_VALUE) { // L: 45
						var4 = true; // L: 46
					} else if (var2.field1468 != null) { // L: 48
						if (var0.field1530) { // L: 49
							float var5 = (float)var2.field1474; // L: 58
							float var9 = var2.field1467; // L: 59
							float var6 = var5 + 0.33333334F * var2.field1473; // L: 60
							float var10 = var2.field1472 * 0.33333334F + var9; // L: 61
							float var8 = (float)var2.field1468.field1474; // L: 62
							float var12 = var2.field1468.field1467; // L: 63
							float var7 = var8 - 0.33333334F * var2.field1468.field1469; // L: 64
							float var11 = var12 - var2.field1468.field1470 * 0.33333334F; // L: 65
							if (var0.field1545) { // L: 66
								float var15 = var10; // L: 69
								float var16 = var11; // L: 70
								if (var0 != null) { // L: 72
									float var17 = var8 - var5; // L: 75
									if (0.0D != (double)var17) { // L: 76
										float var18 = var6 - var5; // L: 79
										float var19 = var7 - var5; // L: 80
										float[] var20 = new float[]{var18 / var17, var19 / var17}; // L: 81 82 83
										var0.field1525 = var20[0] == 0.33333334F && var20[1] == 0.6666667F; // L: 84
										float var21 = var20[0]; // L: 85
										float var22 = var20[1]; // L: 86
										if ((double)var20[0] < 0.0D) { // L: 87
											var20[0] = 0.0F;
										}

										if ((double)var20[1] > 1.0D) { // L: 88
											var20[1] = 1.0F;
										}

										if ((double)var20[0] > 1.0D || var20[1] < -1.0F) { // L: 89
											var20[1] = 1.0F - var20[1]; // L: 91
											if (var20[0] < 0.0F) { // L: 92
												var20[0] = 0.0F;
											}

											if (var20[1] < 0.0F) { // L: 93
												var20[1] = 0.0F;
											}

											if (var20[0] > 1.0F || var20[1] > 1.0F) { // L: 94
												float var23 = (float)(((double)var20[1] - 2.0D) * (double)var20[1] + (double)((var20[1] + (var20[0] - 2.0F)) * var20[0]) + 1.0D); // L: 95
												if (var23 + class121.field1479 > 0.0F) { // L: 96
													if (class121.field1479 + var20[0] < 1.3333334F) { // L: 98
														float var24 = var20[0] - 2.0F; // L: 99
														float var25 = var20[0] - 1.0F; // L: 100
														float var26 = (float)Math.sqrt((double)(var24 * var24 - 4.0F * var25 * var25)); // L: 101
														float var27 = 0.5F * (-var24 + var26); // L: 102
														if (var20[1] + class121.field1479 > var27) { // L: 103
															var20[1] = var27 - class121.field1479; // L: 104
														} else {
															var27 = (-var24 - var26) * 0.5F; // L: 107
															if (var20[1] < var27 + class121.field1479) { // L: 108
																var20[1] = class121.field1479 + var27; // L: 109
															}
														}
													} else {
														var20[0] = 1.3333334F - class121.field1479; // L: 114
														var20[1] = 0.33333334F - class121.field1479; // L: 115
													}
												}
											}

											var20[1] = 1.0F - var20[1]; // L: 120
										}

										float var10000;
										if (var21 != var20[0]) { // L: 123
											var10000 = var5 + var17 * var20[0]; // L: 124
											if ((double)var21 != 0.0D) { // L: 125
												var15 = var9 + (var10 - var9) * var20[0] / var21; // L: 126
											}
										}

										if (var22 != var20[1]) { // L: 129
											var10000 = var5 + var17 * var20[1]; // L: 130
											if ((double)var22 != 1.0D) { // L: 131
												var16 = (float)((double)var12 - (1.0D - (double)var20[1]) * (double)(var12 - var11) / (1.0D - (double)var22)); // L: 132
											}
										}

										var0.field1520 = var5; // L: 135
										var0.field1527 = var8; // L: 136
										GrandExchangeOfferOwnWorldComparator.method1202(0.0F, var20[0], var20[1], 1.0F, var0); // L: 137
										FriendSystem.method1909(var9, var15, var16, var12, var0); // L: 138
									}
								}
							} else {
								ScriptFrame.method1155(var0, var5, var6, var7, var8, var9, var10, var11, var12); // L: 142
							}

							var0.field1530 = false; // L: 144
						}
					} else {
						var3 = true; // L: 148
					}

					if (var3) { // L: 150
						return var2.field1467; // L: 151
					} else if (var4) { // L: 153
						return (float)var2.field1474 != var1 && var2.field1468 != null ? var2.field1468.field1467 : var2.field1467; // L: 154 155 158
					} else {
						return var0.field1545 ? DynamicObject.method2202(var0, var1) : class382.method7405(var0, var1); // L: 161 162 165
					}
				}
			}
		} else {
			return 0.0F; // L: 21
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)[Lde;",
		garbageValue = "1673828737"
	)
	static class123[] method2852() {
		return new class123[]{class123.field1502, class123.field1504, class123.field1503, class123.field1506, class123.field1505}; // L: 127
	}
}

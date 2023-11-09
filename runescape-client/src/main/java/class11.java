import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;
import org.bouncycastle.crypto.tls.Certificate;
import org.bouncycastle.crypto.tls.CertificateRequest;
import org.bouncycastle.crypto.tls.TlsAuthentication;
import org.bouncycastle.crypto.tls.TlsCredentials;

@ObfuscatedName("a")
class class11 implements TlsAuthentication {
	@ObfuscatedName("uc")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	@Export("masterDisk")
	static ArchiveDisk masterDisk;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lnh;"
	)
	static Bounds field60;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lu;"
	)
	final class13 this$2;

	@ObfuscatedSignature(
		descriptor = "(Lu;)V"
	)
	class11(class13 var1) {
		this.this$2 = var1; // L: 313
	}

	public void notifyServerCertificate(Certificate var1) throws IOException {
		try {
			CertificateFactory var2 = CertificateFactory.getInstance("X.509"); // L: 317
			LinkedList var3 = new LinkedList(); // L: 318
			org.bouncycastle.asn1.x509.Certificate[] var4 = var1.getCertificateList(); // L: 320

			for (int var5 = 0; var5 < var4.length; ++var5) { // L: 321
				org.bouncycastle.asn1.x509.Certificate var6 = var4[var5]; // L: 322
				var3.add(var2.generateCertificate(new ByteArrayInputStream(var6.getEncoded()))); // L: 324
			}

			this.this$2.this$1.field70 = (java.security.cert.Certificate[])((java.security.cert.Certificate[])var3.toArray(new java.security.cert.Certificate[0])); // L: 328
		} catch (CertificateException var7) { // L: 330
			throw new IOException(var7); // L: 331
		}
	} // L: 333

	public TlsCredentials getClientCredentials(CertificateRequest var1) throws IOException {
		return null; // L: 337
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "-2079417313"
	)
	public static String method108(CharSequence var0) {
		int var1 = var0.length(); // L: 11
		StringBuilder var2 = new StringBuilder(var1); // L: 12

		for (int var3 = 0; var3 < var1; ++var3) { // L: 13
			char var4 = var0.charAt(var3); // L: 14
			if ((var4 < 'a' || var4 > 'z') && (var4 < 'A' || var4 > 'Z') && (var4 < '0' || var4 > '9') && var4 != '.' && var4 != '-' && var4 != '*' && var4 != '_') { // L: 15
				if (var4 == ' ') { // L: 16
					var2.append('+');
				} else {
					byte var5 = class300.charToByteCp1252(var4); // L: 18
					var2.append('%'); // L: 19
					int var6 = var5 >> 4 & 15; // L: 20
					if (var6 >= 10) { // L: 21
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48)); // L: 22
					}

					var6 = var5 & 15; // L: 23
					if (var6 >= 10) { // L: 24
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48)); // L: 25
					}
				}
			} else {
				var2.append(var4);
			}
		}

		return var2.toString(); // L: 28
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "-778238321"
	)
	static int method104(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 6600) { // L: 4136
			var3 = class268.Client_plane; // L: 4137
			int var15 = Decimator.baseX * 64 + (ScriptFrame.localPlayer.x >> 7); // L: 4138
			int var8 = class7.baseY * 64 + (ScriptFrame.localPlayer.y >> 7); // L: 4139
			class65.getWorldMap().method7130(var3, var15, var8, true); // L: 4140
			return 1; // L: 4141
		} else {
			WorldMapArea var9;
			if (var0 == ScriptOpcodes.WORLDMAP_GETMAPNAME) { // L: 4143
				var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 4144
				String var16 = ""; // L: 4145
				var9 = class65.getWorldMap().getMapArea(var3); // L: 4146
				if (var9 != null) { // L: 4147
					var16 = var9.getExternalName(); // L: 4148
				}

				Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var16; // L: 4150
				return 1; // L: 4151
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETMAP) { // L: 4153
				var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 4154
				class65.getWorldMap().setCurrentMapAreaId(var3); // L: 4155
				return 1; // L: 4156
			} else if (var0 == ScriptOpcodes.WORLDMAP_GETZOOM) { // L: 4158
				Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = class65.getWorldMap().getZoomLevel(); // L: 4159
				return 1; // L: 4160
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETZOOM) { // L: 4162
				var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 4163
				class65.getWorldMap().setZoomPercentage(var3); // L: 4164
				return 1; // L: 4165
			} else if (var0 == ScriptOpcodes.WORLDMAP_ISLOADED) { // L: 4167
				Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = class65.getWorldMap().isCacheLoaded() ? 1 : 0; // L: 4168
				return 1; // L: 4169
			} else {
				Coord var14;
				if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) { // L: 4171
					var14 = new Coord(Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]); // L: 4172
					class65.getWorldMap().setWorldMapPositionTarget(var14.x, var14.y); // L: 4173
					return 1; // L: 4174
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) { // L: 4176
					var14 = new Coord(Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]); // L: 4177
					class65.getWorldMap().setWorldMapPositionTargetInstant(var14.x, var14.y); // L: 4178
					return 1; // L: 4179
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) { // L: 4181
					var14 = new Coord(Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]); // L: 4182
					class65.getWorldMap().jumpToSourceCoord(var14.plane, var14.x, var14.y); // L: 4183
					return 1; // L: 4184
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) { // L: 4186
					var14 = new Coord(Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]); // L: 4187
					class65.getWorldMap().jumpToSourceCoordInstant(var14.plane, var14.x, var14.y); // L: 4188
					return 1; // L: 4189
				} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) { // L: 4191
					Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = class65.getWorldMap().getDisplayX(); // L: 4192
					Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = class65.getWorldMap().getDisplayY(); // L: 4193
					return 1; // L: 4194
				} else {
					WorldMapArea var11;
					if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) { // L: 4196
						var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 4197
						var11 = class65.getWorldMap().getMapArea(var3); // L: 4198
						if (var11 == null) { // L: 4199
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 4200
						} else {
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var11.getOrigin().packed(); // L: 4203
						}

						return 1; // L: 4205
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) { // L: 4207
						var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 4208
						var11 = class65.getWorldMap().getMapArea(var3); // L: 4209
						if (var11 == null) { // L: 4210
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 4211
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 4212
						} else {
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = (var11.getRegionHighX() - var11.getRegionLowX() + 1) * 64; // L: 4215
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = (var11.getRegionHighY() - var11.getRegionLowY() + 1) * 64; // L: 4216
						}

						return 1; // L: 4218
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) { // L: 4220
						var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 4221
						var11 = class65.getWorldMap().getMapArea(var3); // L: 4222
						if (var11 == null) { // L: 4223
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 4224
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 4225
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 4226
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 4227
						} else {
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var11.getRegionLowX() * 64; // L: 4230
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var11.getRegionLowY() * 64; // L: 4231
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var11.getRegionHighX() * 64 + 64 - 1; // L: 4232
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var11.getRegionHighY() * 64 + 64 - 1; // L: 4233
						}

						return 1; // L: 4235
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) { // L: 4237
						var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 4238
						var11 = class65.getWorldMap().getMapArea(var3); // L: 4239
						if (var11 == null) { // L: 4240
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = -1; // L: 4241
						} else {
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var11.getZoom(); // L: 4244
						}

						return 1; // L: 4246
					} else if (var0 == 6615) { // L: 4248
						var14 = class65.getWorldMap().getDisplayCoord(); // L: 4249
						if (var14 == null) { // L: 4250
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = -1; // L: 4251
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = -1; // L: 4252
						} else {
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var14.x; // L: 4255
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var14.y; // L: 4256
						}

						return 1; // L: 4258
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) { // L: 4260
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = class65.getWorldMap().currentMapAreaId(); // L: 4261
						return 1; // L: 4262
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) { // L: 4264
						var14 = new Coord(Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]); // L: 4265
						var11 = class65.getWorldMap().getCurrentMapArea(); // L: 4266
						if (var11 == null) { // L: 4267
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = -1; // L: 4268
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = -1; // L: 4269
							return 1; // L: 4270
						} else {
							int[] var12 = var11.position(var14.plane, var14.x, var14.y); // L: 4272
							if (var12 == null) { // L: 4273
								Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = -1; // L: 4274
								Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = -1; // L: 4275
							} else {
								Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var12[0]; // L: 4278
								Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var12[1]; // L: 4279
							}

							return 1; // L: 4281
						}
					} else {
						Coord var5;
						if (var0 == 6618) { // L: 4283
							var14 = new Coord(Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]); // L: 4284
							var11 = class65.getWorldMap().getCurrentMapArea(); // L: 4285
							if (var11 == null) { // L: 4286
								Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = -1; // L: 4287
								Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = -1; // L: 4288
								return 1; // L: 4289
							} else {
								var5 = var11.coord(var14.x, var14.y); // L: 4291
								if (var5 == null) { // L: 4292
									Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = -1; // L: 4293
								} else {
									Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var5.packed(); // L: 4296
								}

								return 1; // L: 4298
							}
						} else {
							Coord var10;
							if (var0 == 6619) { // L: 4300
								Nameable.Interpreter_intStackSize -= 2; // L: 4301
								var3 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 4302
								var10 = new Coord(Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]); // L: 4303
								class18.method264(var3, var10, false); // L: 4304
								return 1; // L: 4305
							} else if (var0 == 6620) { // L: 4307
								Nameable.Interpreter_intStackSize -= 2; // L: 4308
								var3 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 4309
								var10 = new Coord(Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]); // L: 4310
								class18.method264(var3, var10, true); // L: 4311
								return 1; // L: 4312
							} else if (var0 == ScriptOpcodes.WORLDMAP_COORDINMAP) { // L: 4314
								Nameable.Interpreter_intStackSize -= 2; // L: 4315
								var3 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 4316
								var10 = new Coord(Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]); // L: 4317
								var9 = class65.getWorldMap().getMapArea(var3); // L: 4318
								if (var9 == null) { // L: 4319
									Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 4320
									return 1; // L: 4321
								} else {
									Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var9.containsCoord(var10.plane, var10.x, var10.y) ? 1 : 0; // L: 4323
									return 1; // L: 4324
								}
							} else if (var0 == ScriptOpcodes.WORLDMAP_GETSIZE) { // L: 4326
								Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = class65.getWorldMap().getDisplayWith(); // L: 4327
								Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = class65.getWorldMap().getDisplayHeight(); // L: 4328
								return 1; // L: 4329
							} else if (var0 == 6623) { // L: 4331
								var14 = new Coord(Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]); // L: 4332
								var11 = class65.getWorldMap().mapAreaAtCoord(var14.plane, var14.x, var14.y); // L: 4333
								if (var11 == null) { // L: 4334
									Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = -1; // L: 4335
								} else {
									Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var11.getId(); // L: 4338
								}

								return 1; // L: 4340
							} else if (var0 == 6624) { // L: 4342
								class65.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]); // L: 4343
								return 1; // L: 4344
							} else if (var0 == 6625) { // L: 4346
								class65.getWorldMap().resetMaxFlashCount(); // L: 4347
								return 1; // L: 4348
							} else if (var0 == 6626) { // L: 4350
								class65.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]); // L: 4351
								return 1; // L: 4352
							} else if (var0 == 6627) { // L: 4354
								class65.getWorldMap().resetCyclesPerFlash(); // L: 4355
								return 1; // L: 4356
							} else {
								boolean var13;
								if (var0 == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) { // L: 4358
									var13 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize] == 1; // L: 4359
									class65.getWorldMap().setPerpetualFlash(var13); // L: 4360
									return 1; // L: 4361
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENT) { // L: 4363
									var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 4364
									class65.getWorldMap().flashElement(var3); // L: 4365
									return 1; // L: 4366
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) { // L: 4368
									var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 4369
									class65.getWorldMap().flashCategory(var3); // L: 4370
									return 1; // L: 4371
								} else if (var0 == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) { // L: 4373
									class65.getWorldMap().stopCurrentFlashes(); // L: 4374
									return 1; // L: 4375
								} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) { // L: 4377
									var13 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize] == 1; // L: 4378
									class65.getWorldMap().setElementsDisabled(var13); // L: 4379
									return 1; // L: 4380
								} else {
									boolean var7;
									if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) { // L: 4382
										Nameable.Interpreter_intStackSize -= 2; // L: 4383
										var3 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 4384
										var7 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1] == 1; // L: 4385
										class65.getWorldMap().disableElement(var3, var7); // L: 4386
										return 1; // L: 4387
									} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) { // L: 4389
										Nameable.Interpreter_intStackSize -= 2; // L: 4390
										var3 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 4391
										var7 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1] == 1; // L: 4392
										class65.getWorldMap().setCategoryDisabled(var3, var7); // L: 4393
										return 1; // L: 4394
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) { // L: 4396
										Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = class65.getWorldMap().getElementsDisabled() ? 1 : 0; // L: 4397
										return 1; // L: 4398
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) { // L: 4400
										var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 4401
										Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = class65.getWorldMap().isElementDisabled(var3) ? 1 : 0; // L: 4402
										return 1; // L: 4403
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) { // L: 4405
										var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 4406
										Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = class65.getWorldMap().isCategoryDisabled(var3) ? 1 : 0; // L: 4407
										return 1; // L: 4408
									} else if (var0 == 6638) { // L: 4410
										Nameable.Interpreter_intStackSize -= 2; // L: 4411
										var3 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 4412
										var10 = new Coord(Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]); // L: 4413
										var5 = class65.getWorldMap().method7174(var3, var10); // L: 4414
										if (var5 == null) { // L: 4415
											Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = -1; // L: 4416
										} else {
											Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var5.packed(); // L: 4419
										}

										return 1; // L: 4421
									} else {
										AbstractWorldMapIcon var6;
										if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) { // L: 4423
											var6 = class65.getWorldMap().iconStart(); // L: 4424
											if (var6 == null) { // L: 4425
												Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = -1; // L: 4426
												Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = -1; // L: 4427
											} else {
												Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var6.getElement(); // L: 4430
												Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var6.coord2.packed(); // L: 4431
											}

											return 1; // L: 4433
										} else if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) { // L: 4435
											var6 = class65.getWorldMap().iconNext(); // L: 4436
											if (var6 == null) { // L: 4437
												Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = -1; // L: 4438
												Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = -1; // L: 4439
											} else {
												Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var6.getElement(); // L: 4442
												Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var6.coord2.packed(); // L: 4443
											}

											return 1; // L: 4445
										} else {
											WorldMapElement var4;
											if (var0 == ScriptOpcodes.MEC_TEXT) { // L: 4447
												var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 4448
												var4 = EnumComposition.WorldMapElement_get(var3); // L: 4449
												if (var4.name == null) { // L: 4450
													Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = ""; // L: 4451
												} else {
													Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var4.name; // L: 4454
												}

												return 1; // L: 4456
											} else if (var0 == ScriptOpcodes.MEC_TEXTSIZE) { // L: 4458
												var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 4459
												var4 = EnumComposition.WorldMapElement_get(var3); // L: 4460
												Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var4.textSize; // L: 4461
												return 1; // L: 4462
											} else if (var0 == ScriptOpcodes.MEC_CATEGORY) { // L: 4464
												var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 4465
												var4 = EnumComposition.WorldMapElement_get(var3); // L: 4466
												if (var4 == null) { // L: 4467
													Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = -1; // L: 4468
												} else {
													Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var4.category; // L: 4471
												}

												return 1; // L: 4473
											} else if (var0 == ScriptOpcodes.MEC_SPRITE) { // L: 4475
												var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 4476
												var4 = EnumComposition.WorldMapElement_get(var3); // L: 4477
												if (var4 == null) { // L: 4478
													Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = -1; // L: 4479
												} else {
													Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var4.sprite1; // L: 4482
												}

												return 1; // L: 4484
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENT) { // L: 4486
												Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = class160.worldMapEvent.mapElement; // L: 4487
												return 1; // L: 4488
											} else if (var0 == 6698) { // L: 4490
												Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = class160.worldMapEvent.coord1.packed(); // L: 4491
												return 1; // L: 4492
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENTCOORD) { // L: 4494
												Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = class160.worldMapEvent.coord2.packed(); // L: 4495
												return 1; // L: 4496
											} else {
												return 2; // L: 4498
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}

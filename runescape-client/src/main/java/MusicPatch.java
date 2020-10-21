import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hk")
@Implements("MusicPatch")
public class MusicPatch extends Node {
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1306227375
	)
	@Export("pcmSampleLength")
	public static int pcmSampleLength;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1308325501
	)
	int field2507;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "[Ldo;"
	)
	@Export("rawSounds")
	RawSound[] rawSounds;
	@ObfuscatedName("l")
	short[] field2504;
	@ObfuscatedName("m")
	byte[] field2502;
	@ObfuscatedName("z")
	byte[] field2505;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "[Lgi;"
	)
	MusicPatchNode2[] field2506;
	@ObfuscatedName("k")
	byte[] field2509;
	@ObfuscatedName("c")
	int[] field2508;

	MusicPatch(byte[] var1) {
		this.rawSounds = new RawSound[128];
		this.field2504 = new short[128];
		this.field2502 = new byte[128];
		this.field2505 = new byte[128];
		this.field2506 = new MusicPatchNode2[128];
		this.field2509 = new byte[128];
		this.field2508 = new int[128];
		Buffer var2 = new Buffer(var1);

		int var3;
		for (var3 = 0; var2.array[var3 + var2.offset] != 0; ++var3) {
		}

		byte[] var4 = new byte[var3];

		int var5;
		for (var5 = 0; var5 < var3; ++var5) {
			var4[var5] = var2.readByte();
		}

		++var2.offset;
		++var3;
		var5 = var2.offset;
		var2.offset += var3;

		int var6;
		for (var6 = 0; var2.array[var6 + var2.offset] != 0; ++var6) {
		}

		byte[] var7 = new byte[var6];

		int var8;
		for (var8 = 0; var8 < var6; ++var8) {
			var7[var8] = var2.readByte();
		}

		++var2.offset;
		++var6;
		var8 = var2.offset;
		var2.offset += var6;

		int var9;
		for (var9 = 0; var2.array[var9 + var2.offset] != 0; ++var9) {
		}

		byte[] var10 = new byte[var9];

		for (int var11 = 0; var11 < var9; ++var11) {
			var10[var11] = var2.readByte();
		}

		++var2.offset;
		++var9;
		byte[] var36 = new byte[var9];
		int var12;
		int var14;
		if (var9 > 1) {
			var36[1] = 1;
			int var13 = 1;
			var12 = 2;

			for (var14 = 2; var14 < var9; ++var14) {
				int var15 = var2.readUnsignedByte();
				if (var15 == 0) {
					var13 = var12++;
				} else {
					if (var15 <= var13) {
						--var15;
					}

					var13 = var15;
				}

				var36[var14] = (byte)var13;
			}
		} else {
			var12 = var9;
		}

		MusicPatchNode2[] var37 = new MusicPatchNode2[var12];

		MusicPatchNode2 var38;
		for (var14 = 0; var14 < var37.length; ++var14) {
			var38 = var37[var14] = new MusicPatchNode2();
			int var16 = var2.readUnsignedByte();
			if (var16 > 0) {
				var38.field2423 = new byte[var16 * 2];
			}

			var16 = var2.readUnsignedByte();
			if (var16 > 0) {
				var38.field2426 = new byte[var16 * 2 + 2];
				var38.field2426[1] = 64;
			}
		}

		var14 = var2.readUnsignedByte();
		byte[] var45 = var14 > 0 ? new byte[var14 * 2] : null;
		var14 = var2.readUnsignedByte();
		byte[] var39 = var14 > 0 ? new byte[var14 * 2] : null;

		int var17;
		for (var17 = 0; var2.array[var17 + var2.offset] != 0; ++var17) {
		}

		byte[] var18 = new byte[var17];

		int var19;
		for (var19 = 0; var19 < var17; ++var19) {
			var18[var19] = var2.readByte();
		}

		++var2.offset;
		++var17;
		var19 = 0;

		int var20;
		for (var20 = 0; var20 < 128; ++var20) {
			var19 += var2.readUnsignedByte();
			this.field2504[var20] = (short)var19;
		}

		var19 = 0;

		short[] var48;
		for (var20 = 0; var20 < 128; ++var20) {
			var19 += var2.readUnsignedByte();
			var48 = this.field2504;
			var48[var20] = (short)(var48[var20] + (var19 << 8));
		}

		var20 = 0;
		int var21 = 0;
		int var22 = 0;

		int var23;
		for (var23 = 0; var23 < 128; ++var23) {
			if (var20 == 0) {
				if (var21 < var18.length) {
					var20 = var18[var21++];
				} else {
					var20 = -1;
				}

				var22 = var2.readVarInt();
			}

			var48 = this.field2504;
			var48[var23] = (short)(var48[var23] + ((var22 - 1 & 2) << 14));
			this.field2508[var23] = var22;
			--var20;
		}

		var20 = 0;
		var21 = 0;
		var23 = 0;

		int var24;
		for (var24 = 0; var24 < 128; ++var24) {
			if (this.field2508[var24] != 0) {
				if (var20 == 0) {
					if (var21 < var4.length) {
						var20 = var4[var21++];
					} else {
						var20 = -1;
					}

					var23 = var2.array[var5++] - 1;
				}

				this.field2509[var24] = (byte)var23;
				--var20;
			}
		}

		var20 = 0;
		var21 = 0;
		var24 = 0;

		for (int var25 = 0; var25 < 128; ++var25) {
			if (this.field2508[var25] != 0) {
				if (var20 == 0) {
					if (var21 < var7.length) {
						var20 = var7[var21++];
					} else {
						var20 = -1;
					}

					var24 = var2.array[var8++] + 16 << 2;
				}

				this.field2505[var25] = (byte)var24;
				--var20;
			}
		}

		var20 = 0;
		var21 = 0;
		MusicPatchNode2 var40 = null;

		int var26;
		for (var26 = 0; var26 < 128; ++var26) {
			if (this.field2508[var26] != 0) {
				if (var20 == 0) {
					var40 = var37[var36[var21]];
					if (var21 < var10.length) {
						var20 = var10[var21++];
					} else {
						var20 = -1;
					}
				}

				this.field2506[var26] = var40;
				--var20;
			}
		}

		var20 = 0;
		var21 = 0;
		var26 = 0;

		int var27;
		for (var27 = 0; var27 < 128; ++var27) {
			if (var20 == 0) {
				if (var21 < var18.length) {
					var20 = var18[var21++];
				} else {
					var20 = -1;
				}

				if (this.field2508[var27] > 0) {
					var26 = var2.readUnsignedByte() + 1;
				}
			}

			this.field2502[var27] = (byte)var26;
			--var20;
		}

		this.field2507 = var2.readUnsignedByte() + 1;

		MusicPatchNode2 var28;
		int var29;
		for (var27 = 0; var27 < var12; ++var27) {
			var28 = var37[var27];
			if (var28.field2423 != null) {
				for (var29 = 1; var29 < var28.field2423.length; var29 += 2) {
					var28.field2423[var29] = var2.readByte();
				}
			}

			if (var28.field2426 != null) {
				for (var29 = 3; var29 < var28.field2426.length - 2; var29 += 2) {
					var28.field2426[var29] = var2.readByte();
				}
			}
		}

		if (var45 != null) {
			for (var27 = 1; var27 < var45.length; var27 += 2) {
				var45[var27] = var2.readByte();
			}
		}

		if (var39 != null) {
			for (var27 = 1; var27 < var39.length; var27 += 2) {
				var39[var27] = var2.readByte();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var28 = var37[var27];
			if (var28.field2426 != null) {
				var19 = 0;

				for (var29 = 2; var29 < var28.field2426.length; var29 += 2) {
					var19 = 1 + var19 + var2.readUnsignedByte();
					var28.field2426[var29] = (byte)var19;
				}
			}
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var28 = var37[var27];
			if (var28.field2423 != null) {
				var19 = 0;

				for (var29 = 2; var29 < var28.field2423.length; var29 += 2) {
					var19 = var19 + 1 + var2.readUnsignedByte();
					var28.field2423[var29] = (byte)var19;
				}
			}
		}

		byte var30;
		int var32;
		int var33;
		int var34;
		int var42;
		byte var44;
		if (var45 != null) {
			var19 = var2.readUnsignedByte();
			var45[0] = (byte)var19;

			for (var27 = 2; var27 < var45.length; var27 += 2) {
				var19 = 1 + var19 + var2.readUnsignedByte();
				var45[var27] = (byte)var19;
			}

			var44 = var45[0];
			byte var41 = var45[1];

			for (var29 = 0; var29 < var44; ++var29) {
				this.field2502[var29] = (byte)(var41 * this.field2502[var29] + 32 >> 6);
			}

			for (var29 = 2; var29 < var45.length; var29 += 2) {
				var30 = var45[var29];
				byte var31 = var45[var29 + 1];
				var32 = var41 * (var30 - var44) + (var30 - var44) / 2;

				for (var33 = var44; var33 < var30; ++var33) {
					var34 = SecureRandomCallable.method1238(var32, var30 - var44);
					this.field2502[var33] = (byte)(var34 * this.field2502[var33] + 32 >> 6);
					var32 += var31 - var41;
				}

				var44 = var30;
				var41 = var31;
			}

			for (var42 = var44; var42 < 128; ++var42) {
				this.field2502[var42] = (byte)(var41 * this.field2502[var42] + 32 >> 6);
			}

			var38 = null;
		}

		if (var39 != null) {
			var19 = var2.readUnsignedByte();
			var39[0] = (byte)var19;

			for (var27 = 2; var27 < var39.length; var27 += 2) {
				var19 = var19 + 1 + var2.readUnsignedByte();
				var39[var27] = (byte)var19;
			}

			var44 = var39[0];
			int var47 = var39[1] << 1;

			for (var29 = 0; var29 < var44; ++var29) {
				var42 = var47 + (this.field2505[var29] & 255);
				if (var42 < 0) {
					var42 = 0;
				}

				if (var42 > 128) {
					var42 = 128;
				}

				this.field2505[var29] = (byte)var42;
			}

			int var43;
			for (var29 = 2; var29 < var39.length; var29 += 2) {
				var30 = var39[var29];
				var43 = var39[var29 + 1] << 1;
				var32 = var47 * (var30 - var44) + (var30 - var44) / 2;

				for (var33 = var44; var33 < var30; ++var33) {
					var34 = SecureRandomCallable.method1238(var32, var30 - var44);
					int var35 = var34 + (this.field2505[var33] & 255);
					if (var35 < 0) {
						var35 = 0;
					}

					if (var35 > 128) {
						var35 = 128;
					}

					this.field2505[var33] = (byte)var35;
					var32 += var43 - var47;
				}

				var44 = var30;
				var47 = var43;
			}

			for (var42 = var44; var42 < 128; ++var42) {
				var43 = var47 + (this.field2505[var42] & 255);
				if (var43 < 0) {
					var43 = 0;
				}

				if (var43 > 128) {
					var43 = 128;
				}

				this.field2505[var42] = (byte)var43;
			}

			Object var46 = null;
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var37[var27].field2419 = var2.readUnsignedByte();
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var28 = var37[var27];
			if (var28.field2423 != null) {
				var28.field2420 = var2.readUnsignedByte();
			}

			if (var28.field2426 != null) {
				var28.field2421 = var2.readUnsignedByte();
			}

			if (var28.field2419 > 0) {
				var28.field2422 = var2.readUnsignedByte();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var37[var27].field2424 = var2.readUnsignedByte();
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var28 = var37[var27];
			if (var28.field2424 > 0) {
				var28.field2418 = var2.readUnsignedByte();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var28 = var37[var27];
			if (var28.field2418 > 0) {
				var28.field2425 = var2.readUnsignedByte();
			}
		}

	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(Lds;[B[IB)Z",
		garbageValue = "-125"
	)
	boolean method4026(SoundCache var1, byte[] var2, int[] var3) {
		boolean var4 = true;
		int var5 = 0;
		RawSound var6 = null;

		for (int var7 = 0; var7 < 128; ++var7) {
			if (var2 == null || var2[var7] != 0) {
				int var8 = this.field2508[var7];
				if (var8 != 0) {
					if (var8 != var5) {
						var5 = var8--;
						if ((var8 & 1) == 0) {
							var6 = var1.getSoundEffect(var8 >> 2, var3);
						} else {
							var6 = var1.getMusicSample(var8 >> 2, var3);
						}

						if (var6 == null) {
							var4 = false;
						}
					}

					if (var6 != null) {
						this.rawSounds[var7] = var6;
						this.field2508[var7] = 0;
					}
				}
			}
		}

		return var4;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "793986731"
	)
	@Export("clear")
	void clear() {
		this.field2508 = null;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(IB)Z",
		garbageValue = "87"
	)
	public static boolean method4039(int var0) {
		return (var0 >> 20 & 1) != 0;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1645227256"
	)
	static void method4038() {
		if (Login.Login_username == null || Login.Login_username.length() <= 0) {
			if (GrandExchangeOfferAgeComparator.clientPreferences.rememberedUsername != null) {
				Login.Login_username = GrandExchangeOfferAgeComparator.clientPreferences.rememberedUsername;
				Client.Login_isUsernameRemembered = true;
			} else {
				Client.Login_isUsernameRemembered = false;
			}

		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		signature = "(ILco;ZI)I",
		garbageValue = "733181439"
	)
	static int method4036(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 6600) {
			var3 = GrandExchangeOfferUnitPriceComparator.Client_plane;
			int var9 = FloorDecoration.baseX * 64 + (PlayerType.localPlayer.x >> 7);
			int var5 = WorldMapData_0.baseY * 64 + (PlayerType.localPlayer.y >> 7);
			Canvas.getWorldMap().method6464(var3, var9, var5, true);
			return 1;
		} else {
			WorldMapArea var11;
			if (var0 == ScriptOpcodes.WORLDMAP_GETMAPNAME) {
				var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
				String var16 = "";
				var11 = Canvas.getWorldMap().getMapArea(var3);
				if (var11 != null) {
					var16 = var11.getExternalName();
				}

				Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var16;
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETMAP) {
				var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
				Canvas.getWorldMap().setCurrentMapAreaId(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_GETZOOM) {
				Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Canvas.getWorldMap().getZoomLevel();
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETZOOM) {
				var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
				Canvas.getWorldMap().setZoomPercentage(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_ISLOADED) {
				Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Canvas.getWorldMap().isCacheLoaded() ? 1 : 0;
				return 1;
			} else {
				Coord var15;
				if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) {
					var15 = new Coord(Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]);
					Canvas.getWorldMap().setWorldMapPositionTarget(var15.x, var15.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) {
					var15 = new Coord(Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]);
					Canvas.getWorldMap().setWorldMapPositionTargetInstant(var15.x, var15.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) {
					var15 = new Coord(Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]);
					Canvas.getWorldMap().jumpToSourceCoord(var15.plane, var15.x, var15.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) {
					var15 = new Coord(Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]);
					Canvas.getWorldMap().jumpToSourceCoordInstant(var15.plane, var15.x, var15.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) {
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Canvas.getWorldMap().getDisplayX();
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Canvas.getWorldMap().getDisplayY();
					return 1;
				} else {
					WorldMapArea var13;
					if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) {
						var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
						var13 = Canvas.getWorldMap().getMapArea(var3);
						if (var13 == null) {
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var13.getOrigin().packed();
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) {
						var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
						var13 = Canvas.getWorldMap().getMapArea(var3);
						if (var13 == null) {
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = (var13.getRegionHighX() - var13.getRegionLowX() + 1) * 64;
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = (var13.getRegionHighY() - var13.getRegionLowY() + 1) * 64;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) {
						var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
						var13 = Canvas.getWorldMap().getMapArea(var3);
						if (var13 == null) {
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var13.getRegionLowX() * 64;
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var13.getRegionLowY() * 64;
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var13.getRegionHighX() * 64 + 64 - 1;
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var13.getRegionHighY() * 64 + 64 - 1;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) {
						var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
						var13 = Canvas.getWorldMap().getMapArea(var3);
						if (var13 == null) {
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var13.getZoom();
						}

						return 1;
					} else if (var0 == 6615) {
						var15 = Canvas.getWorldMap().getDisplayCoord();
						if (var15 == null) {
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var15.x;
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var15.y;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) {
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Canvas.getWorldMap().currentMapAreaId();
						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) {
						var15 = new Coord(Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]);
						var13 = Canvas.getWorldMap().getCurrentMapArea();
						if (var13 == null) {
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = -1;
							return 1;
						} else {
							int[] var14 = var13.position(var15.plane, var15.x, var15.y);
							if (var14 == null) {
								Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = -1;
								Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = -1;
							} else {
								Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var14[0];
								Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var14[1];
							}

							return 1;
						}
					} else {
						Coord var7;
						if (var0 == 6618) {
							var15 = new Coord(Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]);
							var13 = Canvas.getWorldMap().getCurrentMapArea();
							if (var13 == null) {
								Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = -1;
								Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = -1;
								return 1;
							} else {
								var7 = var13.coord(var15.x, var15.y);
								if (var7 == null) {
									Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = -1;
								} else {
									Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var7.packed();
								}

								return 1;
							}
						} else {
							Coord var12;
							if (var0 == 6619) {
								MilliClock.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize];
								var12 = new Coord(Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]);
								WorldMapData_1.method796(var3, var12, false);
								return 1;
							} else if (var0 == 6620) {
								MilliClock.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize];
								var12 = new Coord(Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]);
								WorldMapData_1.method796(var3, var12, true);
								return 1;
							} else if (var0 == ScriptOpcodes.WORLDMAP_COORDINMAP) {
								MilliClock.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize];
								var12 = new Coord(Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]);
								var11 = Canvas.getWorldMap().getMapArea(var3);
								if (var11 == null) {
									Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0;
									return 1;
								} else {
									Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var11.containsCoord(var12.plane, var12.x, var12.y) ? 1 : 0;
									return 1;
								}
							} else if (var0 == ScriptOpcodes.WORLDMAP_GETSIZE) {
								Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Canvas.getWorldMap().getDisplayWith();
								Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Canvas.getWorldMap().getDisplayHeight();
								return 1;
							} else if (var0 == 6623) {
								var15 = new Coord(Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]);
								var13 = Canvas.getWorldMap().mapAreaAtCoord(var15.plane, var15.x, var15.y);
								if (var13 == null) {
									Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = -1;
								} else {
									Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var13.getId();
								}

								return 1;
							} else if (var0 == 6624) {
								Canvas.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]);
								return 1;
							} else if (var0 == 6625) {
								Canvas.getWorldMap().resetMaxFlashCount();
								return 1;
							} else if (var0 == 6626) {
								Canvas.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]);
								return 1;
							} else if (var0 == 6627) {
								Canvas.getWorldMap().resetCyclesPerFlash();
								return 1;
							} else {
								boolean var10;
								if (var0 == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) {
									var10 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1;
									Canvas.getWorldMap().setPerpetualFlash(var10);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENT) {
									var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
									Canvas.getWorldMap().flashElement(var3);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) {
									var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
									Canvas.getWorldMap().flashCategory(var3);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) {
									Canvas.getWorldMap().stopCurrentFlashes();
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) {
									var10 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1;
									Canvas.getWorldMap().setElementsDisabled(var10);
									return 1;
								} else {
									boolean var4;
									if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) {
										MilliClock.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize];
										var4 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1] == 1;
										Canvas.getWorldMap().disableElement(var3, var4);
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) {
										MilliClock.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize];
										var4 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1] == 1;
										Canvas.getWorldMap().setCategoryDisabled(var3, var4);
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) {
										Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Canvas.getWorldMap().getElementsDisabled() ? 1 : 0;
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) {
										var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
										Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Canvas.getWorldMap().isElementDisabled(var3) ? 1 : 0;
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) {
										var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
										Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Canvas.getWorldMap().isCategoryDisabled(var3) ? 1 : 0;
										return 1;
									} else if (var0 == 6638) {
										MilliClock.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize];
										var12 = new Coord(Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]);
										var7 = Canvas.getWorldMap().method6481(var3, var12);
										if (var7 == null) {
											Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = -1;
										} else {
											Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var7.packed();
										}

										return 1;
									} else {
										AbstractWorldMapIcon var8;
										if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) {
											var8 = Canvas.getWorldMap().iconStart();
											if (var8 == null) {
												Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = -1;
												Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var8.getElement();
												Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var8.coord2.packed();
											}

											return 1;
										} else if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) {
											var8 = Canvas.getWorldMap().iconNext();
											if (var8 == null) {
												Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = -1;
												Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var8.getElement();
												Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var8.coord2.packed();
											}

											return 1;
										} else {
											WorldMapElement var6;
											if (var0 == ScriptOpcodes.MEC_TEXT) {
												var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
												var6 = class194.WorldMapElement_get(var3);
												if (var6.name == null) {
													Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = "";
												} else {
													Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var6.name;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.MEC_TEXTSIZE) {
												var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
												var6 = class194.WorldMapElement_get(var3);
												Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var6.textSize;
												return 1;
											} else if (var0 == ScriptOpcodes.MEC_CATEGORY) {
												var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
												var6 = class194.WorldMapElement_get(var3);
												if (var6 == null) {
													Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var6.category;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.MEC_SPRITE) {
												var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
												var6 = class194.WorldMapElement_get(var3);
												if (var6 == null) {
													Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var6.sprite1;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENT) {
												Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = WorldMapSection0.worldMapEvent.mapElement;
												return 1;
											} else if (var0 == 6698) {
												Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = WorldMapSection0.worldMapEvent.coord1.packed();
												return 1;
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENTCOORD) {
												Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = WorldMapSection0.worldMapEvent.coord2.packed();
												return 1;
											} else {
												return 2;
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

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		signature = "(ZLks;B)V",
		garbageValue = "44"
	)
	@Export("updateNpcs")
	static final void updateNpcs(boolean var0, PacketBuffer var1) {
		Client.field802 = 0;
		Client.field726 = 0;
		PacketBuffer var2 = Client.packetWriter.packetBuffer;
		var2.importIndex();
		int var3 = var2.readBits(8);
		int var4;
		if (var3 < Client.npcCount) {
			for (var4 = var3; var4 < Client.npcCount; ++var4) {
				Client.field803[++Client.field802 - 1] = Client.npcIndices[var4];
			}
		}

		if (var3 > Client.npcCount) {
			throw new RuntimeException("");
		} else {
			Client.npcCount = 0;

			for (var4 = 0; var4 < var3; ++var4) {
				int var5 = Client.npcIndices[var4];
				NPC var6 = Client.npcs[var5];
				int var7 = var2.readBits(1);
				if (var7 == 0) {
					Client.npcIndices[++Client.npcCount - 1] = var5;
					var6.npcCycle = Client.cycle;
				} else {
					int var8 = var2.readBits(2);
					if (var8 == 0) {
						Client.npcIndices[++Client.npcCount - 1] = var5;
						var6.npcCycle = Client.cycle;
						Client.field727[++Client.field726 - 1] = var5;
					} else {
						int var9;
						int var10;
						if (var8 == 1) {
							Client.npcIndices[++Client.npcCount - 1] = var5;
							var6.npcCycle = Client.cycle;
							var9 = var2.readBits(3);
							var6.method2150(var9, (byte)1);
							var10 = var2.readBits(1);
							if (var10 == 1) {
								Client.field727[++Client.field726 - 1] = var5;
							}
						} else if (var8 == 2) {
							Client.npcIndices[++Client.npcCount - 1] = var5;
							var6.npcCycle = Client.cycle;
							var9 = var2.readBits(3);
							var6.method2150(var9, (byte)2);
							var10 = var2.readBits(3);
							var6.method2150(var10, (byte)2);
							int var11 = var2.readBits(1);
							if (var11 == 1) {
								Client.field727[++Client.field726 - 1] = var5;
							}
						} else if (var8 == 3) {
							Client.field803[++Client.field802 - 1] = var5;
						}
					}
				}
			}

			WorldMapCacheName.method724(var0, var1);
			SoundSystem.method2632(var1);

			int var12;
			for (var12 = 0; var12 < Client.field802; ++var12) {
				var3 = Client.field803[var12];
				if (Client.npcs[var3].npcCycle != Client.cycle) {
					Client.npcs[var3].definition = null;
					Client.npcs[var3] = null;
				}
			}

			if (var1.offset != Client.packetWriter.serverPacketLength) {
				throw new RuntimeException(var1.offset + "," + Client.packetWriter.serverPacketLength);
			} else {
				for (var12 = 0; var12 < Client.npcCount; ++var12) {
					if (Client.npcs[Client.npcIndices[var12]] == null) {
						throw new RuntimeException(var12 + "," + Client.npcCount);
					}
				}

			}
		}
	}
}

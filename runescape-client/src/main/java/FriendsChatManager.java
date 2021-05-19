import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lx")
@Implements("FriendsChatManager")
public class FriendsChatManager extends NameableContainer {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("localUser")
	final Usernamed localUser;
	@ObfuscatedName("g")
	@Export("name")
	public String name;
	@ObfuscatedName("l")
	@Export("owner")
	public String owner;
	@ObfuscatedName("z")
	@Export("minKick")
	public byte minKick;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 504381773
	)
	@Export("rank")
	public int rank;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1476924317
	)
	int field3835;

	@ObfuscatedSignature(
		descriptor = "(Lnj;Llt;)V"
	)
	public FriendsChatManager(LoginType var1, Usernamed var2) {
		super(100);
		this.name = null;
		this.owner = null;
		this.field3835 = 1;
		this.loginType = var1;
		this.localUser = var2;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Llm;",
		garbageValue = "-1768347101"
	)
	@Export("newInstance")
	Nameable newInstance() {
		return new FriendsChatMember();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)[Llm;",
		garbageValue = "836907267"
	)
	@Export("newTypedArray")
	Nameable[] newTypedArray(int var1) {
		return new FriendsChatMember[var1];
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1078557001"
	)
	@Export("readName")
	final void readName(String var1) {
		long var5 = 0L;
		int var7 = var1.length();

		for (int var8 = 0; var8 < var7; ++var8) {
			var5 *= 37L;
			char var9 = var1.charAt(var8);
			if (var9 >= 'A' && var9 <= 'Z') {
				var5 += (long)(var9 + 1 - 65);
			} else if (var9 >= 'a' && var9 <= 'z') {
				var5 += (long)(var9 + 1 - 97);
			} else if (var9 >= '0' && var9 <= '9') {
				var5 += (long)(var9 + 27 - 48);
			}

			if (var5 >= 177917621779460413L) {
				break;
			}
		}

		while (var5 % 37L == 0L && var5 != 0L) {
			var5 /= 37L;
		}

		String var10 = MilliClock.base37DecodeLong(var5);
		if (var10 == null) {
			var10 = "";
		}

		this.name = var10;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-786554920"
	)
	@Export("setOwner")
	final void setOwner(String var1) {
		long var5 = 0L;
		int var7 = var1.length();

		for (int var8 = 0; var8 < var7; ++var8) {
			var5 *= 37L;
			char var9 = var1.charAt(var8);
			if (var9 >= 'A' && var9 <= 'Z') {
				var5 += (long)(var9 + 1 - 65);
			} else if (var9 >= 'a' && var9 <= 'z') {
				var5 += (long)(var9 + 1 - 97);
			} else if (var9 >= '0' && var9 <= '9') {
				var5 += (long)(var9 + 27 - 48);
			}

			if (var5 >= 177917621779460413L) {
				break;
			}
		}

		while (0L == var5 % 37L && var5 != 0L) {
			var5 /= 37L;
		}

		String var10 = MilliClock.base37DecodeLong(var5);
		if (var10 == null) {
			var10 = "";
		}

		this.owner = var10;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)V",
		garbageValue = "1366673555"
	)
	@Export("readUpdate")
	public final void readUpdate(Buffer var1) {
		this.setOwner(var1.readStringCp1252NullTerminated());
		long var2 = var1.readLong();
		long var5 = var2;
		String var4;
		int var7;
		if (var2 > 0L && var2 < 6582952005840035281L) {
			if (0L == var2 % 37L) {
				var4 = null;
			} else {
				var7 = 0;

				for (long var8 = var2; var8 != 0L; var8 /= 37L) {
					++var7;
				}

				StringBuilder var10 = new StringBuilder(var7);

				while (0L != var5) {
					long var11 = var5;
					var5 /= 37L;
					var10.append(class305.base37Table[(int)(var11 - 37L * var5)]);
				}

				var4 = var10.reverse().toString();
			}
		} else {
			var4 = null;
		}

		this.readName(var4);
		this.minKick = var1.readByte();
		var7 = var1.readUnsignedByte();
		if (var7 != 255) {
			this.clear();

			for (int var13 = 0; var13 < var7; ++var13) {
				FriendsChatMember var9 = (FriendsChatMember)this.addLastNoPreviousUsername(new Username(var1.readStringCp1252NullTerminated(), this.loginType));
				int var14 = var1.readUnsignedShort();
				var9.set(var14, ++this.field3835 - 1);
				var9.rank = var1.readByte();
				var1.readStringCp1252NullTerminated();
				this.isLocalPlayer(var9);
			}

		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)V",
		garbageValue = "-759910337"
	)
	public final void method5519(Buffer var1) {
		Username var2 = new Username(var1.readStringCp1252NullTerminated(), this.loginType);
		int var3 = var1.readUnsignedShort();
		byte var4 = var1.readByte();
		boolean var5 = false;
		if (var4 == -128) {
			var5 = true;
		}

		FriendsChatMember var6;
		if (var5) {
			if (this.getSize() == 0) {
				return;
			}

			var6 = (FriendsChatMember)this.getByCurrentUsername(var2);
			if (var6 != null && var6.getWorld() == var3) {
				this.remove(var6);
			}
		} else {
			var1.readStringCp1252NullTerminated();
			var6 = (FriendsChatMember)this.getByCurrentUsername(var2);
			if (var6 == null) {
				if (this.getSize() > super.capacity) {
					return;
				}

				var6 = (FriendsChatMember)this.addLastNoPreviousUsername(var2);
			}

			var6.set(var3, ++this.field3835 - 1);
			var6.rank = var4;
			this.isLocalPlayer(var6);
		}

	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1356197970"
	)
	@Export("clearFriends")
	public final void clearFriends() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) {
			((FriendsChatMember)this.get(var1)).clearIsFriend();
		}

	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-404793839"
	)
	@Export("invalidateIgnoreds")
	public final void invalidateIgnoreds() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) {
			((FriendsChatMember)this.get(var1)).clearIsIgnored();
		}

	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Llh;I)V",
		garbageValue = "-1814056265"
	)
	@Export("isLocalPlayer")
	final void isLocalPlayer(FriendsChatMember var1) {
		if (var1.getUsername().equals(this.localUser.username())) {
			this.rank = var1.rank;
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILgz;Lfa;B)V",
		garbageValue = "-119"
	)
	static final void method5541(int var0, int var1, int var2, int var3, int var4, int var5, Scene var6, CollisionMap var7) {
		if (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var1][var2] & 2) != 0 || (Tiles.Tiles_renderFlags[var0][var1][var2] & 16) == 0) {
			if (var0 < Tiles.Tiles_minPlane) {
				Tiles.Tiles_minPlane = var0;
			}

			ObjectComposition var8 = AttackOption.getObjectDefinition(var3);
			int var9;
			int var10;
			if (var4 != 1 && var4 != 3) {
				var9 = var8.sizeX;
				var10 = var8.sizeY;
			} else {
				var9 = var8.sizeY;
				var10 = var8.sizeX;
			}

			int var11;
			int var12;
			if (var9 + var1 <= 104) {
				var11 = (var9 >> 1) + var1;
				var12 = (var9 + 1 >> 1) + var1;
			} else {
				var11 = var1;
				var12 = var1 + 1;
			}

			int var13;
			int var14;
			if (var10 + var2 <= 104) {
				var13 = (var10 >> 1) + var2;
				var14 = var2 + (var10 + 1 >> 1);
			} else {
				var13 = var2;
				var14 = var2 + 1;
			}

			int[][] var15 = Tiles.Tiles_heights[var0];
			int var16 = var15[var12][var13] + var15[var11][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
			int var17 = (var1 << 7) + (var9 << 6);
			int var18 = (var2 << 7) + (var10 << 6);
			long var19 = class17.calculateTag(var1, var2, 2, var8.int1 == 0, var3);
			int var21 = var5 + (var4 << 6);
			if (var8.int3 == 1) {
				var21 += 256;
			}

			int var23;
			int var24;
			if (var8.hasSound()) {
				ObjectSound var22 = new ObjectSound();
				var22.plane = var0;
				var22.x = var1 * 128;
				var22.y = var2 * 16384;
				var23 = var8.sizeX;
				var24 = var8.sizeY;
				if (var4 == 1 || var4 == 3) {
					var23 = var8.sizeY;
					var24 = var8.sizeX;
				}

				var22.field926 = (var23 + var1) * 128;
				var22.field927 = (var24 + var2) * 128;
				var22.soundEffectId = var8.ambientSoundId;
				var22.field929 = var8.int4 * 128;
				var22.field934 = var8.int5;
				var22.field932 = var8.int6;
				var22.soundEffectIds = var8.soundEffectIds;
				if (var8.transforms != null) {
					var22.obj = var8;
					var22.set();
				}

				ObjectSound.objectSounds.addFirst(var22);
				if (var22.soundEffectIds != null) {
					var22.field923 = var22.field934 + (int)(Math.random() * (double)(var22.field932 - var22.field934));
				}
			}

			Object var34;
			if (var5 == 22) {
				if (!Client.isLowDetail || var8.int1 != 0 || var8.interactType == 1 || var8.boolean2) {
					if (var8.animationId == -1 && var8.transforms == null) {
						var34 = var8.getEntity(22, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, 22, var4, var0, var1, var2, var8.animationId, var8.field1761, (Renderable)null);
					}

					var6.newFloorDecoration(var0, var1, var2, var16, (Renderable)var34, var19, var21);
					if (var8.interactType == 1 && var7 != null) {
						var7.setBlockedByFloorDec(var1, var2);
					}

				}
			} else if (var5 != 10 && var5 != 11) {
				int[] var10000;
				if (var5 >= 12) {
					if (var8.animationId == -1 && var8.transforms == null) {
						var34 = var8.getEntity(var5, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.field1761, (Renderable)null);
					}

					var6.method4008(var0, var1, var2, var16, 1, 1, (Renderable)var34, 0, var19, var21);
					if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) {
						var10000 = Tiles.field1105[var0][var1];
						var10000[var2] |= 2340;
					}

					if (var8.interactType != 0 && var7 != null) {
						var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
					}

				} else if (var5 == 0) {
					if (var8.animationId == -1 && var8.transforms == null) {
						var34 = var8.getEntity(0, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, 0, var4, var0, var1, var2, var8.animationId, var8.field1761, (Renderable)null);
					}

					var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field1085[var4], 0, var19, var21);
					if (var4 == 0) {
						if (var8.clipped) {
							Tiles.field1090[var0][var1][var2] = 50;
							Tiles.field1090[var0][var1][var2 + 1] = 50;
						}

						if (var8.modelClipped) {
							var10000 = Tiles.field1105[var0][var1];
							var10000[var2] |= 585;
						}
					} else if (var4 == 1) {
						if (var8.clipped) {
							Tiles.field1090[var0][var1][var2 + 1] = 50;
							Tiles.field1090[var0][var1 + 1][var2 + 1] = 50;
						}

						if (var8.modelClipped) {
							var10000 = Tiles.field1105[var0][var1];
							var10000[var2 + 1] |= 1170;
						}
					} else if (var4 == 2) {
						if (var8.clipped) {
							Tiles.field1090[var0][var1 + 1][var2] = 50;
							Tiles.field1090[var0][var1 + 1][var2 + 1] = 50;
						}

						if (var8.modelClipped) {
							var10000 = Tiles.field1105[var0][var1 + 1];
							var10000[var2] |= 585;
						}
					} else if (var4 == 3) {
						if (var8.clipped) {
							Tiles.field1090[var0][var1][var2] = 50;
							Tiles.field1090[var0][var1 + 1][var2] = 50;
						}

						if (var8.modelClipped) {
							var10000 = Tiles.field1105[var0][var1];
							var10000[var2] |= 1170;
						}
					}

					if (var8.interactType != 0 && var7 != null) {
						var7.method3094(var1, var2, var5, var4, var8.boolean1);
					}

					if (var8.int2 != 16) {
						var6.method3917(var0, var1, var2, var8.int2);
					}

				} else if (var5 == 1) {
					if (var8.animationId == -1 && var8.transforms == null) {
						var34 = var8.getEntity(1, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, 1, var4, var0, var1, var2, var8.animationId, var8.field1761, (Renderable)null);
					}

					var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field1095[var4], 0, var19, var21);
					if (var8.clipped) {
						if (var4 == 0) {
							Tiles.field1090[var0][var1][var2 + 1] = 50;
						} else if (var4 == 1) {
							Tiles.field1090[var0][var1 + 1][var2 + 1] = 50;
						} else if (var4 == 2) {
							Tiles.field1090[var0][var1 + 1][var2] = 50;
						} else if (var4 == 3) {
							Tiles.field1090[var0][var1][var2] = 50;
						}
					}

					if (var8.interactType != 0 && var7 != null) {
						var7.method3094(var1, var2, var5, var4, var8.boolean1);
					}

				} else {
					int var28;
					if (var5 == 2) {
						var28 = var4 + 1 & 3;
						Object var31;
						Object var32;
						if (var8.animationId == -1 && var8.transforms == null) {
							var31 = var8.getEntity(2, var4 + 4, var15, var17, var16, var18);
							var32 = var8.getEntity(2, var28, var15, var17, var16, var18);
						} else {
							var31 = new DynamicObject(var3, 2, var4 + 4, var0, var1, var2, var8.animationId, var8.field1761, (Renderable)null);
							var32 = new DynamicObject(var3, 2, var28, var0, var1, var2, var8.animationId, var8.field1761, (Renderable)null);
						}

						var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var31, (Renderable)var32, Tiles.field1085[var4], Tiles.field1085[var28], var19, var21);
						if (var8.modelClipped) {
							if (var4 == 0) {
								var10000 = Tiles.field1105[var0][var1];
								var10000[var2] |= 585;
								var10000 = Tiles.field1105[var0][var1];
								var10000[var2 + 1] |= 1170;
							} else if (var4 == 1) {
								var10000 = Tiles.field1105[var0][var1];
								var10000[var2 + 1] |= 1170;
								var10000 = Tiles.field1105[var0][var1 + 1];
								var10000[var2] |= 585;
							} else if (var4 == 2) {
								var10000 = Tiles.field1105[var0][var1 + 1];
								var10000[var2] |= 585;
								var10000 = Tiles.field1105[var0][var1];
								var10000[var2] |= 1170;
							} else if (var4 == 3) {
								var10000 = Tiles.field1105[var0][var1];
								var10000[var2] |= 1170;
								var10000 = Tiles.field1105[var0][var1];
								var10000[var2] |= 585;
							}
						}

						if (var8.interactType != 0 && var7 != null) {
							var7.method3094(var1, var2, var5, var4, var8.boolean1);
						}

						if (var8.int2 != 16) {
							var6.method3917(var0, var1, var2, var8.int2);
						}

					} else if (var5 == 3) {
						if (var8.animationId == -1 && var8.transforms == null) {
							var34 = var8.getEntity(3, var4, var15, var17, var16, var18);
						} else {
							var34 = new DynamicObject(var3, 3, var4, var0, var1, var2, var8.animationId, var8.field1761, (Renderable)null);
						}

						var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field1095[var4], 0, var19, var21);
						if (var8.clipped) {
							if (var4 == 0) {
								Tiles.field1090[var0][var1][var2 + 1] = 50;
							} else if (var4 == 1) {
								Tiles.field1090[var0][var1 + 1][var2 + 1] = 50;
							} else if (var4 == 2) {
								Tiles.field1090[var0][var1 + 1][var2] = 50;
							} else if (var4 == 3) {
								Tiles.field1090[var0][var1][var2] = 50;
							}
						}

						if (var8.interactType != 0 && var7 != null) {
							var7.method3094(var1, var2, var5, var4, var8.boolean1);
						}

					} else if (var5 == 9) {
						if (var8.animationId == -1 && var8.transforms == null) {
							var34 = var8.getEntity(var5, var4, var15, var17, var16, var18);
						} else {
							var34 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.field1761, (Renderable)null);
						}

						var6.method4008(var0, var1, var2, var16, 1, 1, (Renderable)var34, 0, var19, var21);
						if (var8.interactType != 0 && var7 != null) {
							var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
						}

						if (var8.int2 != 16) {
							var6.method3917(var0, var1, var2, var8.int2);
						}

					} else if (var5 == 4) {
						if (var8.animationId == -1 && var8.transforms == null) {
							var34 = var8.getEntity(4, var4, var15, var17, var16, var18);
						} else {
							var34 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.field1761, (Renderable)null);
						}

						var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field1085[var4], 0, 0, 0, var19, var21);
					} else {
						Object var25;
						long var29;
						if (var5 == 5) {
							var28 = 16;
							var29 = var6.getBoundaryObjectTag(var0, var1, var2);
							if (var29 != 0L) {
								var28 = AttackOption.getObjectDefinition(class6.Entity_unpackID(var29)).int2;
							}

							if (var8.animationId == -1 && var8.transforms == null) {
								var25 = var8.getEntity(4, var4, var15, var17, var16, var18);
							} else {
								var25 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.field1761, (Renderable)null);
							}

							var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, Tiles.field1085[var4], 0, var28 * Tiles.field1096[var4], var28 * Tiles.field1100[var4], var19, var21);
						} else if (var5 == 6) {
							var28 = 8;
							var29 = var6.getBoundaryObjectTag(var0, var1, var2);
							if (var29 != 0L) {
								var28 = AttackOption.getObjectDefinition(class6.Entity_unpackID(var29)).int2 / 2;
							}

							if (var8.animationId == -1 && var8.transforms == null) {
								var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
							} else {
								var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.field1761, (Renderable)null);
							}

							var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, 256, var4, var28 * Tiles.field1098[var4], var28 * Tiles.field1094[var4], var19, var21);
						} else if (var5 == 7) {
							var23 = var4 + 2 & 3;
							if (var8.animationId == -1 && var8.transforms == null) {
								var34 = var8.getEntity(4, var23 + 4, var15, var17, var16, var18);
							} else {
								var34 = new DynamicObject(var3, 4, var23 + 4, var0, var1, var2, var8.animationId, var8.field1761, (Renderable)null);
							}

							var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, 256, var23, 0, 0, var19, var21);
						} else if (var5 == 8) {
							var28 = 8;
							var29 = var6.getBoundaryObjectTag(var0, var1, var2);
							if (0L != var29) {
								var28 = AttackOption.getObjectDefinition(class6.Entity_unpackID(var29)).int2 / 2;
							}

							int var27 = var4 + 2 & 3;
							Object var26;
							if (var8.animationId == -1 && var8.transforms == null) {
								var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
								var26 = var8.getEntity(4, var27 + 4, var15, var17, var16, var18);
							} else {
								var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.field1761, (Renderable)null);
								var26 = new DynamicObject(var3, 4, var27 + 4, var0, var1, var2, var8.animationId, var8.field1761, (Renderable)null);
							}

							var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)var26, 256, var4, var28 * Tiles.field1098[var4], var28 * Tiles.field1094[var4], var19, var21);
						}
					}
				}
			} else {
				if (var8.animationId == -1 && var8.transforms == null) {
					var34 = var8.getEntity(10, var4, var15, var17, var16, var18);
				} else {
					var34 = new DynamicObject(var3, 10, var4, var0, var1, var2, var8.animationId, var8.field1761, (Renderable)null);
				}

				if (var34 != null && var6.method4008(var0, var1, var2, var16, var9, var10, (Renderable)var34, var5 == 11 ? 256 : 0, var19, var21) && var8.clipped) {
					var23 = 15;
					if (var34 instanceof Model) {
						var23 = ((Model)var34).method4125() / 4;
						if (var23 > 30) {
							var23 = 30;
						}
					}

					for (var24 = 0; var24 <= var9; ++var24) {
						for (int var33 = 0; var33 <= var10; ++var33) {
							if (var23 > Tiles.field1090[var0][var24 + var1][var33 + var2]) {
								Tiles.field1090[var0][var24 + var1][var33 + var2] = (byte)var23;
							}
						}
					}
				}

				if (var8.interactType != 0 && var7 != null) {
					var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
				}

			}
		}
	}
}

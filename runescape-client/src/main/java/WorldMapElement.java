import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fe")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("WorldMapElement_archive")
	static AbstractArchive WorldMapElement_archive;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "[Lfe;"
	)
	@Export("WorldMapElement_cached")
	static WorldMapElement[] WorldMapElement_cached;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	@Export("WorldMapElement_cachedSprites")
	public static EvictingDualNodeHashTable WorldMapElement_cachedSprites;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1379795179
	)
	@Export("objectId")
	public final int objectId;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 2113232637
	)
	@Export("sprite1")
	public int sprite1;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 2125463965
	)
	@Export("sprite2")
	int sprite2;
	@ObfuscatedName("j")
	@Export("name")
	public String name;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 959892129
	)
	public int field1825;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1991096547
	)
	@Export("textSize")
	public int textSize;
	@ObfuscatedName("n")
	public boolean field1828;
	@ObfuscatedName("x")
	public boolean field1836;
	@ObfuscatedName("g")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("p")
	@Export("menuTargetName")
	public String menuTargetName;
	@ObfuscatedName("b")
	int[] field1832;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -305443147
	)
	int field1833;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 363163641
	)
	int field1822;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1592769705
	)
	int field1834;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -429130067
	)
	int field1835;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lfq;"
	)
	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lfd;"
	)
	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;
	@ObfuscatedName("s")
	int[] field1839;
	@ObfuscatedName("i")
	byte[] field1820;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1303466775
	)
	@Export("category")
	public int category;

	static {
		WorldMapElement_cachedSprites = new EvictingDualNodeHashTable(256); // L: 16
	}

	WorldMapElement(int var1) {
		this.sprite1 = -1; // L: 18
		this.sprite2 = -1; // L: 19
		this.textSize = 0;
		this.field1828 = true;
		this.field1836 = false; // L: 25
		this.menuActions = new String[5]; // L: 26
		this.field1833 = Integer.MAX_VALUE; // L: 29
		this.field1822 = Integer.MAX_VALUE; // L: 30
		this.field1834 = Integer.MIN_VALUE; // L: 31
		this.field1835 = Integer.MIN_VALUE; // L: 32
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered; // L: 33
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered; // L: 34
		this.category = -1; // L: 37
		this.objectId = var1; // L: 40
	} // L: 41

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqw;I)V",
		garbageValue = "-1745475712"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 70
			if (var2 == 0) { // L: 71
				return; // L: 74
			}

			this.decodeNext(var1, var2); // L: 72
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lqw;II)V",
		garbageValue = "-1121502166"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 77
			this.sprite1 = var1.method7752();
		} else if (var2 == 2) { // L: 78
			this.sprite2 = var1.method7752();
		} else if (var2 == 3) { // L: 79
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) { // L: 80
			this.field1825 = var1.readMedium();
		} else if (var2 == 5) { // L: 81
			var1.readMedium(); // L: 82
		} else if (var2 == 6) { // L: 84
			this.textSize = var1.readUnsignedByte();
		} else {
			int var6;
			if (var2 == 7) { // L: 85
				var6 = var1.readUnsignedByte(); // L: 86
				if ((var6 & 1) == 0) { // L: 87
					this.field1828 = false;
				}

				if ((var6 & 2) == 2) { // L: 88
					this.field1836 = true;
				}
			} else if (var2 == 8) { // L: 90
				var1.readUnsignedByte(); // L: 91
			} else if (var2 >= 10 && var2 <= 14) { // L: 93
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) { // L: 94
				var6 = var1.readUnsignedByte(); // L: 95
				this.field1832 = new int[var6 * 2]; // L: 96

				int var4;
				for (var4 = 0; var4 < var6 * 2; ++var4) { // L: 97
					this.field1832[var4] = var1.readShort();
				}

				var1.readInt(); // L: 98
				var4 = var1.readUnsignedByte(); // L: 99
				this.field1839 = new int[var4]; // L: 100

				int var5;
				for (var5 = 0; var5 < this.field1839.length; ++var5) { // L: 101
					this.field1839[var5] = var1.readInt();
				}

				this.field1820 = new byte[var6]; // L: 102

				for (var5 = 0; var5 < var6; ++var5) { // L: 103
					this.field1820[var5] = var1.readByte();
				}
			} else if (var2 != 16) { // L: 105
				if (var2 == 17) { // L: 106
					this.menuTargetName = var1.readStringCp1252NullTerminated();
				} else if (var2 == 18) { // L: 107
					var1.method7752(); // L: 108
				} else if (var2 == 19) { // L: 110
					this.category = var1.readUnsignedShort();
				} else if (var2 == 21) { // L: 111
					var1.readInt(); // L: 112
				} else if (var2 == 22) { // L: 114
					var1.readInt(); // L: 115
				} else if (var2 == 23) { // L: 117
					var1.readUnsignedByte(); // L: 118
					var1.readUnsignedByte(); // L: 119
					var1.readUnsignedByte(); // L: 120
				} else if (var2 == 24) { // L: 122
					var1.readShort(); // L: 123
					var1.readShort(); // L: 124
				} else if (var2 == 25) { // L: 126
					var1.method7752(); // L: 127
				} else if (var2 == 28) { // L: 129
					var1.readUnsignedByte(); // L: 130
				} else if (var2 == 29) { // L: 132
					HorizontalAlignment[] var3 = new HorizontalAlignment[]{HorizontalAlignment.field1903, HorizontalAlignment.HorizontalAlignment_centered, HorizontalAlignment.field1902}; // L: 135
					this.horizontalAlignment = (HorizontalAlignment)class271.findEnumerated(var3, var1.readUnsignedByte()); // L: 137
				} else if (var2 == 30) { // L: 139
					VerticalAlignment[] var7 = new VerticalAlignment[]{VerticalAlignment.field1952, VerticalAlignment.VerticalAlignment_centered, VerticalAlignment.field1953}; // L: 142
					this.verticalAlignment = (VerticalAlignment)class271.findEnumerated(var7, var1.readUnsignedByte()); // L: 144
				}
			}
		}

	} // L: 147

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "664605468"
	)
	void method3380() {
		if (this.field1832 != null) { // L: 150
			for (int var1 = 0; var1 < this.field1832.length; var1 += 2) { // L: 151
				if (this.field1832[var1] < this.field1833) { // L: 152
					this.field1833 = this.field1832[var1];
				} else if (this.field1832[var1] > this.field1834) { // L: 153
					this.field1834 = this.field1832[var1];
				}

				if (this.field1832[var1 + 1] < this.field1822) { // L: 154
					this.field1822 = this.field1832[var1 + 1];
				} else if (this.field1832[var1 + 1] > this.field1835) {
					this.field1835 = this.field1832[var1 + 1]; // L: 155
				}
			}
		}

	} // L: 158

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lqj;",
		garbageValue = "-2042273416"
	)
	@Export("getSpriteBool")
	public SpritePixels getSpriteBool(boolean var1) {
		int var2 = this.sprite1; // L: 161
		return this.getSprite(var2); // L: 162
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IS)Lqj;",
		garbageValue = "12042"
	)
	@Export("getSprite")
	SpritePixels getSprite(int var1) {
		if (var1 < 0) { // L: 166
			return null;
		} else {
			SpritePixels var2 = (SpritePixels)WorldMapElement_cachedSprites.get((long)var1); // L: 167
			if (var2 != null) { // L: 168
				return var2;
			} else {
				var2 = SoundSystem.SpriteBuffer_getSprite(WorldMapElement_archive, var1, 0); // L: 169
				if (var2 != null) { // L: 170
					WorldMapElement_cachedSprites.put(var2, (long)var1); // L: 171
				}

				return var2; // L: 173
			}
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "22"
	)
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId; // L: 177
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "1"
	)
	@Export("ItemContainer_getCount")
	static int ItemContainer_getCount(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 21
		if (var2 == null) { // L: 22
			return 0;
		} else {
			return var1 >= 0 && var1 < var2.quantities.length ? var2.quantities[var1] : 0; // L: 23 24
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ILbc;ZI)I",
		garbageValue = "1220578687"
	)
	static int method3356(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 6600) { // L: 4127
			var3 = FriendSystem.Client_plane; // L: 4128
			int var15 = class300.baseX * 64 + (class28.localPlayer.x >> 7); // L: 4129
			int var8 = Message.baseY * 64 + (class28.localPlayer.y >> 7); // L: 4130
			class273.getWorldMap().method7249(var3, var15, var8, true); // L: 4131
			return 1; // L: 4132
		} else {
			WorldMapArea var9;
			if (var0 == ScriptOpcodes.WORLDMAP_GETMAPNAME) { // L: 4134
				var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 4135
				String var16 = ""; // L: 4136
				var9 = class273.getWorldMap().getMapArea(var3); // L: 4137
				if (var9 != null) { // L: 4138
					var16 = var9.getExternalName(); // L: 4139
				}

				Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var16; // L: 4141
				return 1; // L: 4142
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETMAP) { // L: 4144
				var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 4145
				class273.getWorldMap().setCurrentMapAreaId(var3); // L: 4146
				return 1; // L: 4147
			} else if (var0 == ScriptOpcodes.WORLDMAP_GETZOOM) { // L: 4149
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class273.getWorldMap().getZoomLevel(); // L: 4150
				return 1; // L: 4151
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETZOOM) { // L: 4153
				var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 4154
				class273.getWorldMap().setZoomPercentage(var3); // L: 4155
				return 1; // L: 4156
			} else if (var0 == ScriptOpcodes.WORLDMAP_ISLOADED) { // L: 4158
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class273.getWorldMap().isCacheLoaded() ? 1 : 0; // L: 4159
				return 1; // L: 4160
			} else {
				Coord var14;
				if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) { // L: 4162
					var14 = new Coord(Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]); // L: 4163
					class273.getWorldMap().setWorldMapPositionTarget(var14.x, var14.y); // L: 4164
					return 1; // L: 4165
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) { // L: 4167
					var14 = new Coord(Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]); // L: 4168
					class273.getWorldMap().setWorldMapPositionTargetInstant(var14.x, var14.y); // L: 4169
					return 1; // L: 4170
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) { // L: 4172
					var14 = new Coord(Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]); // L: 4173
					class273.getWorldMap().jumpToSourceCoord(var14.plane, var14.x, var14.y); // L: 4174
					return 1; // L: 4175
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) { // L: 4177
					var14 = new Coord(Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]); // L: 4178
					class273.getWorldMap().jumpToSourceCoordInstant(var14.plane, var14.x, var14.y); // L: 4179
					return 1; // L: 4180
				} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) { // L: 4182
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class273.getWorldMap().getDisplayX(); // L: 4183
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class273.getWorldMap().getDisplayY(); // L: 4184
					return 1; // L: 4185
				} else {
					WorldMapArea var11;
					if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) { // L: 4187
						var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 4188
						var11 = class273.getWorldMap().getMapArea(var3); // L: 4189
						if (var11 == null) { // L: 4190
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 4191
						} else {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var11.getOrigin().packed(); // L: 4194
						}

						return 1; // L: 4196
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) { // L: 4198
						var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 4199
						var11 = class273.getWorldMap().getMapArea(var3); // L: 4200
						if (var11 == null) { // L: 4201
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 4202
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 4203
						} else {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = (var11.getRegionHighX() - var11.getRegionLowX() + 1) * 64; // L: 4206
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = (var11.getRegionHighY() - var11.getRegionLowY() + 1) * 64; // L: 4207
						}

						return 1; // L: 4209
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) { // L: 4211
						var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 4212
						var11 = class273.getWorldMap().getMapArea(var3); // L: 4213
						if (var11 == null) { // L: 4214
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 4215
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 4216
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 4217
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 4218
						} else {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var11.getRegionLowX() * 64; // L: 4221
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var11.getRegionLowY() * 64; // L: 4222
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var11.getRegionHighX() * 64 + 64 - 1; // L: 4223
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var11.getRegionHighY() * 64 + 64 - 1; // L: 4224
						}

						return 1; // L: 4226
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) { // L: 4228
						var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 4229
						var11 = class273.getWorldMap().getMapArea(var3); // L: 4230
						if (var11 == null) { // L: 4231
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1; // L: 4232
						} else {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var11.getZoom(); // L: 4235
						}

						return 1; // L: 4237
					} else if (var0 == 6615) { // L: 4239
						var14 = class273.getWorldMap().getDisplayCoord(); // L: 4240
						if (var14 == null) { // L: 4241
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1; // L: 4242
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1; // L: 4243
						} else {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var14.x; // L: 4246
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var14.y; // L: 4247
						}

						return 1; // L: 4249
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) { // L: 4251
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class273.getWorldMap().currentMapAreaId(); // L: 4252
						return 1; // L: 4253
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) { // L: 4255
						var14 = new Coord(Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]); // L: 4256
						var11 = class273.getWorldMap().getCurrentMapArea(); // L: 4257
						if (var11 == null) { // L: 4258
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1; // L: 4259
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1; // L: 4260
							return 1; // L: 4261
						} else {
							int[] var12 = var11.position(var14.plane, var14.x, var14.y); // L: 4263
							if (var12 == null) { // L: 4264
								Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1; // L: 4265
								Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1; // L: 4266
							} else {
								Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var12[0]; // L: 4269
								Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var12[1]; // L: 4270
							}

							return 1; // L: 4272
						}
					} else {
						Coord var5;
						if (var0 == 6618) { // L: 4274
							var14 = new Coord(Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]); // L: 4275
							var11 = class273.getWorldMap().getCurrentMapArea(); // L: 4276
							if (var11 == null) { // L: 4277
								Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1; // L: 4278
								Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1; // L: 4279
								return 1; // L: 4280
							} else {
								var5 = var11.coord(var14.x, var14.y); // L: 4282
								if (var5 == null) { // L: 4283
									Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1; // L: 4284
								} else {
									Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var5.packed(); // L: 4287
								}

								return 1; // L: 4289
							}
						} else {
							Coord var10;
							if (var0 == 6619) { // L: 4291
								TaskHandler.Interpreter_intStackSize -= 2; // L: 4292
								var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 4293
								var10 = new Coord(Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]); // L: 4294
								AttackOption.method2465(var3, var10, false); // L: 4295
								return 1; // L: 4296
							} else if (var0 == 6620) { // L: 4298
								TaskHandler.Interpreter_intStackSize -= 2; // L: 4299
								var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 4300
								var10 = new Coord(Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]); // L: 4301
								AttackOption.method2465(var3, var10, true); // L: 4302
								return 1; // L: 4303
							} else if (var0 == ScriptOpcodes.WORLDMAP_COORDINMAP) { // L: 4305
								TaskHandler.Interpreter_intStackSize -= 2; // L: 4306
								var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 4307
								var10 = new Coord(Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]); // L: 4308
								var9 = class273.getWorldMap().getMapArea(var3); // L: 4309
								if (var9 == null) { // L: 4310
									Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 4311
									return 1; // L: 4312
								} else {
									Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var9.containsCoord(var10.plane, var10.x, var10.y) ? 1 : 0; // L: 4314
									return 1; // L: 4315
								}
							} else if (var0 == ScriptOpcodes.WORLDMAP_GETSIZE) { // L: 4317
								Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class273.getWorldMap().getDisplayWith(); // L: 4318
								Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class273.getWorldMap().getDisplayHeight(); // L: 4319
								return 1; // L: 4320
							} else if (var0 == 6623) { // L: 4322
								var14 = new Coord(Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]); // L: 4323
								var11 = class273.getWorldMap().mapAreaAtCoord(var14.plane, var14.x, var14.y); // L: 4324
								if (var11 == null) { // L: 4325
									Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1; // L: 4326
								} else {
									Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var11.getId(); // L: 4329
								}

								return 1; // L: 4331
							} else if (var0 == 6624) { // L: 4333
								class273.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]); // L: 4334
								return 1; // L: 4335
							} else if (var0 == 6625) { // L: 4337
								class273.getWorldMap().resetMaxFlashCount(); // L: 4338
								return 1; // L: 4339
							} else if (var0 == 6626) { // L: 4341
								class273.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]); // L: 4342
								return 1; // L: 4343
							} else if (var0 == 6627) { // L: 4345
								class273.getWorldMap().resetCyclesPerFlash(); // L: 4346
								return 1; // L: 4347
							} else {
								boolean var13;
								if (var0 == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) { // L: 4349
									var13 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1; // L: 4350
									class273.getWorldMap().setPerpetualFlash(var13); // L: 4351
									return 1; // L: 4352
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENT) { // L: 4354
									var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 4355
									class273.getWorldMap().flashElement(var3); // L: 4356
									return 1; // L: 4357
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) { // L: 4359
									var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 4360
									class273.getWorldMap().flashCategory(var3); // L: 4361
									return 1; // L: 4362
								} else if (var0 == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) { // L: 4364
									class273.getWorldMap().stopCurrentFlashes(); // L: 4365
									return 1; // L: 4366
								} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) { // L: 4368
									var13 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1; // L: 4369
									class273.getWorldMap().setElementsDisabled(var13); // L: 4370
									return 1; // L: 4371
								} else {
									boolean var7;
									if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) { // L: 4373
										TaskHandler.Interpreter_intStackSize -= 2; // L: 4374
										var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 4375
										var7 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1] == 1; // L: 4376
										class273.getWorldMap().disableElement(var3, var7); // L: 4377
										return 1; // L: 4378
									} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) { // L: 4380
										TaskHandler.Interpreter_intStackSize -= 2; // L: 4381
										var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 4382
										var7 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1] == 1; // L: 4383
										class273.getWorldMap().setCategoryDisabled(var3, var7); // L: 4384
										return 1; // L: 4385
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) { // L: 4387
										Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class273.getWorldMap().getElementsDisabled() ? 1 : 0; // L: 4388
										return 1; // L: 4389
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) { // L: 4391
										var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 4392
										Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class273.getWorldMap().isElementDisabled(var3) ? 1 : 0; // L: 4393
										return 1; // L: 4394
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) { // L: 4396
										var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 4397
										Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class273.getWorldMap().isCategoryDisabled(var3) ? 1 : 0; // L: 4398
										return 1; // L: 4399
									} else if (var0 == 6638) { // L: 4401
										TaskHandler.Interpreter_intStackSize -= 2; // L: 4402
										var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 4403
										var10 = new Coord(Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]); // L: 4404
										var5 = class273.getWorldMap().method7278(var3, var10); // L: 4405
										if (var5 == null) { // L: 4406
											Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1; // L: 4407
										} else {
											Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var5.packed(); // L: 4410
										}

										return 1; // L: 4412
									} else {
										AbstractWorldMapIcon var6;
										if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) { // L: 4414
											var6 = class273.getWorldMap().iconStart(); // L: 4415
											if (var6 == null) { // L: 4416
												Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1; // L: 4417
												Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1; // L: 4418
											} else {
												Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var6.getElement(); // L: 4421
												Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var6.coord2.packed(); // L: 4422
											}

											return 1; // L: 4424
										} else if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) { // L: 4426
											var6 = class273.getWorldMap().iconNext(); // L: 4427
											if (var6 == null) { // L: 4428
												Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1; // L: 4429
												Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1; // L: 4430
											} else {
												Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var6.getElement(); // L: 4433
												Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var6.coord2.packed(); // L: 4434
											}

											return 1; // L: 4436
										} else {
											WorldMapElement var4;
											if (var0 == ScriptOpcodes.MEC_TEXT) { // L: 4438
												var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 4439
												var4 = TileItem.WorldMapElement_get(var3); // L: 4440
												if (var4.name == null) { // L: 4441
													Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = ""; // L: 4442
												} else {
													Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var4.name; // L: 4445
												}

												return 1; // L: 4447
											} else if (var0 == ScriptOpcodes.MEC_TEXTSIZE) { // L: 4449
												var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 4450
												var4 = TileItem.WorldMapElement_get(var3); // L: 4451
												Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var4.textSize; // L: 4452
												return 1; // L: 4453
											} else if (var0 == ScriptOpcodes.MEC_CATEGORY) { // L: 4455
												var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 4456
												var4 = TileItem.WorldMapElement_get(var3); // L: 4457
												if (var4 == null) { // L: 4458
													Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1; // L: 4459
												} else {
													Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var4.category; // L: 4462
												}

												return 1; // L: 4464
											} else if (var0 == ScriptOpcodes.MEC_SPRITE) { // L: 4466
												var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 4467
												var4 = TileItem.WorldMapElement_get(var3); // L: 4468
												if (var4 == null) { // L: 4469
													Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1; // L: 4470
												} else {
													Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var4.sprite1; // L: 4473
												}

												return 1; // L: 4475
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENT) { // L: 4477
												Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class83.worldMapEvent.mapElement; // L: 4478
												return 1; // L: 4479
											} else if (var0 == 6698) { // L: 4481
												Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class83.worldMapEvent.coord1.packed(); // L: 4482
												return 1; // L: 4483
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENTCOORD) { // L: 4485
												Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class83.worldMapEvent.coord2.packed(); // L: 4486
												return 1; // L: 4487
											} else {
												return 2; // L: 4489
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

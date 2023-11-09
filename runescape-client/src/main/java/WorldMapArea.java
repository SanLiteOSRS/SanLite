import java.util.Iterator;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("js")
@Implements("WorldMapArea")
public class WorldMapArea {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1286545103
	)
	@Export("id")
	int id;
	@ObfuscatedName("an")
	@Export("internalName")
	String internalName;
	@ObfuscatedName("aw")
	@Export("externalName")
	String externalName;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1302793257
	)
	@Export("backGroundColor")
	int backGroundColor;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1157501957
	)
	@Export("zoom")
	int zoom;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	@Export("origin")
	Coord origin;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 77939951
	)
	@Export("regionLowX")
	int regionLowX;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1854846129
	)
	@Export("regionHighX")
	int regionHighX;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 2059655157
	)
	@Export("regionLowY")
	int regionLowY;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1086956513
	)
	@Export("regionHighY")
	int regionHighY;
	@ObfuscatedName("ay")
	@Export("isMain")
	boolean isMain;
	@ObfuscatedName("ao")
	@Export("sections")
	LinkedList sections;

	public WorldMapArea() {
		this.id = -1; // L: 9
		this.backGroundColor = -1; // L: 12
		this.zoom = -1; // L: 13
		this.origin = null; // L: 14
		this.regionLowX = Integer.MAX_VALUE; // L: 15
		this.regionHighX = 0; // L: 16
		this.regionLowY = Integer.MAX_VALUE; // L: 17
		this.regionHighY = 0;
		this.isMain = false;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lsg;IB)V",
		garbageValue = "-126"
	)
	@Export("read")
	public void read(Buffer var1, int var2) {
		this.id = var2; // L: 23
		this.internalName = var1.readStringCp1252NullTerminated(); // L: 24
		this.externalName = var1.readStringCp1252NullTerminated(); // L: 25
		this.origin = new Coord(var1.readInt()); // L: 26
		this.backGroundColor = var1.readInt(); // L: 27
		var1.readUnsignedByte(); // L: 28
		this.isMain = var1.readUnsignedByte() == 1; // L: 29
		this.zoom = var1.readUnsignedByte(); // L: 30
		int var3 = var1.readUnsignedByte(); // L: 31
		this.sections = new LinkedList(); // L: 32

		for (int var4 = 0; var4 < var3; ++var4) { // L: 33
			this.sections.add(this.readWorldMapSection(var1)); // L: 34
		}

		this.setBounds(); // L: 36
	} // L: 37

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lsg;I)Lkw;",
		garbageValue = "427135973"
	)
	@Export("readWorldMapSection")
	WorldMapSection readWorldMapSection(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 40
		WorldMapSectionType var3 = (WorldMapSectionType)StructComposition.findEnumerated(WorldMapSectionType.method5421(), var2); // L: 41
		Object var4 = null; // L: 42
		switch(var3.type) { // L: 43
		case 0:
			var4 = new WorldMapSection1(); // L: 50
			break; // L: 51
		case 1:
			var4 = new WorldMapSection2(); // L: 56
			break;
		case 2:
			var4 = new class252(); // L: 53
			break; // L: 54
		case 3:
			var4 = new WorldMapSection0(); // L: 47
			break;
		default:
			throw new IllegalStateException(""); // L: 45
		}

		((WorldMapSection)var4).read(var1); // L: 59
		return (WorldMapSection)var4; // L: 60
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-1323143702"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		Iterator var4 = this.sections.iterator(); // L: 64

		WorldMapSection var5;
		do {
			if (!var4.hasNext()) {
				return false; // L: 72
			}

			var5 = (WorldMapSection)var4.next(); // L: 65
		} while(!var5.containsCoord(var1, var2, var3)); // L: 67

		return true; // L: 68
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1764440845"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		int var3 = var1 / 64; // L: 76
		int var4 = var2 / 64; // L: 77
		if (var3 >= this.regionLowX && var3 <= this.regionHighX) { // L: 78
			if (var4 >= this.regionLowY && var4 <= this.regionHighY) { // L: 79
				Iterator var5 = this.sections.iterator();

				WorldMapSection var6;
				do {
					if (!var5.hasNext()) { // L: 80
						return false; // L: 88
					}

					var6 = (WorldMapSection)var5.next(); // L: 81
				} while(!var6.containsPosition(var1, var2)); // L: 83

				return true; // L: 84
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "6"
	)
	@Export("position")
	public int[] position(int var1, int var2, int var3) {
		Iterator var4 = this.sections.iterator(); // L: 92

		WorldMapSection var5;
		do {
			if (!var4.hasNext()) {
				return null; // L: 100
			}

			var5 = (WorldMapSection)var4.next(); // L: 93
		} while(!var5.containsCoord(var1, var2, var3)); // L: 95

		return var5.getBorderTileLengths(var1, var2, var3); // L: 96
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)Llb;",
		garbageValue = "2133508945"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		Iterator var3 = this.sections.iterator(); // L: 104

		WorldMapSection var4;
		do {
			if (!var3.hasNext()) { // L: 111
				return null; // L: 112
			}

			var4 = (WorldMapSection)var3.next(); // L: 105
		} while(!var4.containsPosition(var1, var2)); // L: 107

		return var4.coord(var1, var2); // L: 108
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1510562162"
	)
	@Export("setBounds")
	void setBounds() {
		Iterator var1 = this.sections.iterator(); // L: 116

		while (var1.hasNext()) {
			WorldMapSection var2 = (WorldMapSection)var1.next(); // L: 117
			var2.expandBounds(this); // L: 119
		}

	} // L: 122

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-964267539"
	)
	@Export("getId")
	public int getId() {
		return this.id; // L: 125
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-926489840"
	)
	@Export("getIsMain")
	public boolean getIsMain() {
		return this.isMain; // L: 129
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1181486070"
	)
	@Export("getInternalName")
	public String getInternalName() {
		return this.internalName; // L: 133
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/lang/String;",
		garbageValue = "25057"
	)
	@Export("getExternalName")
	public String getExternalName() {
		return this.externalName; // L: 137
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2082932774"
	)
	@Export("getBackGroundColor")
	int getBackGroundColor() {
		return this.backGroundColor; // L: 141
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "447952954"
	)
	@Export("getZoom")
	public int getZoom() {
		return this.zoom; // L: 145
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "16748608"
	)
	@Export("getRegionLowX")
	public int getRegionLowX() {
		return this.regionLowX; // L: 149
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1231382819"
	)
	@Export("getRegionHighX")
	public int getRegionHighX() {
		return this.regionHighX; // L: 153
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-599342073"
	)
	@Export("getRegionLowY")
	public int getRegionLowY() {
		return this.regionLowY; // L: 157
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1746970873"
	)
	@Export("getRegionHighY")
	public int getRegionHighY() {
		return this.regionHighY;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "126"
	)
	@Export("getOriginX")
	public int getOriginX() {
		return this.origin.x;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2019541929"
	)
	@Export("getOriginPlane")
	public int getOriginPlane() {
		return this.origin.plane; // L: 169
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-151833963"
	)
	@Export("getOriginY")
	public int getOriginY() {
		return this.origin.y; // L: 173
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Llb;",
		garbageValue = "19"
	)
	@Export("getOrigin")
	public Coord getOrigin() {
		return new Coord(this.origin); // L: 177
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lsg;Ljava/lang/String;I)I",
		garbageValue = "-53610141"
	)
	public static int method5162(Buffer var0, String var1) {
		int var2 = var0.offset; // L: 18
		byte[] var3 = RouteStrategy.method4287(var1); // L: 19
		var0.writeSmartByteShort(var3.length); // L: 20
		var0.offset += class319.huffman.compress(var3, 0, var3.length, var0.array, var0.offset); // L: 21
		return var0.offset - var2; // L: 22
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "32"
	)
	public static void method5163(int var0, int var1) {
		int var2 = Rasterizer3D.field2514.Rasterizer3D_rowOffsets[0]; // L: 161
		int var3 = var2 / Rasterizer2D.Rasterizer2D_width; // L: 162
		int var4 = var2 - var3 * Rasterizer2D.Rasterizer2D_width; // L: 163
		Rasterizer3D.field2514.method4944(var0, var4, var1, var3); // L: 164
	} // L: 165

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(ILch;ZI)I",
		garbageValue = "1955008701"
	)
	static int method5161(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) { // L: 4444
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Players.loadWorlds() ? 1 : 0; // L: 4445
			return 1; // L: 4446
		} else {
			World var9;
			if (var0 == ScriptOpcodes.WORLDLIST_START) { // L: 4448
				var9 = FaceNormal.worldListStart(); // L: 4449
				if (var9 != null) { // L: 4450
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.id; // L: 4451
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.properties; // L: 4452
					Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var9.activity; // L: 4453
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.location; // L: 4454
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.population; // L: 4455
					Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var9.host; // L: 4456
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4459
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4460
					Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = ""; // L: 4461
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4462
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4463
					Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = ""; // L: 4464
				}

				return 1; // L: 4466
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) { // L: 4468
				var9 = Interpreter.getNextWorldListWorld(); // L: 4469
				if (var9 != null) { // L: 4470
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.id; // L: 4471
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.properties; // L: 4472
					Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var9.activity; // L: 4473
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.location; // L: 4474
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.population; // L: 4475
					Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var9.host; // L: 4476
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4479
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4480
					Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = ""; // L: 4481
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4482
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4483
					Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = ""; // L: 4484
				}

				return 1; // L: 4486
			} else {
				int var3;
				World var7;
				int var8;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) { // L: 4488
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4489
					var7 = null; // L: 4490

					for (var8 = 0; var8 < World.World_count; ++var8) { // L: 4491
						if (var3 == class31.World_worlds[var8].id) { // L: 4492
							var7 = class31.World_worlds[var8]; // L: 4493
							break;
						}
					}

					if (var7 != null) { // L: 4497
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.id; // L: 4498
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.properties; // L: 4499
						Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var7.activity; // L: 4500
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.location; // L: 4501
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.population; // L: 4502
						Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var7.host; // L: 4503
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4506
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4507
						Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = ""; // L: 4508
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4509
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4510
						Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = ""; // L: 4511
					}

					return 1; // L: 4513
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) { // L: 4515
					Interpreter.Interpreter_intStackSize -= 4; // L: 4516
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4517
					boolean var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1; // L: 4518
					var8 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 4519
					boolean var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3] == 1; // L: 4520
					class127.sortWorldList(var3, var10, var8, var6); // L: 4521
					return 1; // L: 4522
				} else if (var0 != 6511) { // L: 4524
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) { // L: 4545
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 4546
						return 1; // L: 4547
					} else {
						int var4;
						ParamComposition var5;
						if (var0 == ScriptOpcodes.NC_PARAM) { // L: 4549
							Interpreter.Interpreter_intStackSize -= 2; // L: 4550
							var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4551
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4552
							var5 = class33.getParamDefinition(var4); // L: 4553
							if (var5.isString()) { // L: 4554
								Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = AbstractArchive.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 4555
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = AbstractArchive.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 4558
							}

							return 1; // L: 4560
						} else if (var0 == ScriptOpcodes.LC_PARAM) { // L: 4562
							Interpreter.Interpreter_intStackSize -= 2; // L: 4563
							var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4564
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4565
							var5 = class33.getParamDefinition(var4); // L: 4566
							if (var5.isString()) { // L: 4567
								Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = class144.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 4568
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class144.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 4571
							}

							return 1; // L: 4573
						} else if (var0 == ScriptOpcodes.OC_PARAM) { // L: 4575
							Interpreter.Interpreter_intStackSize -= 2; // L: 4576
							var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4577
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4578
							var5 = class33.getParamDefinition(var4); // L: 4579
							if (var5.isString()) { // L: 4580
								Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = HealthBarUpdate.ItemComposition_get(var3).getStringParam(var4, var5.defaultStr); // L: 4581
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = HealthBarUpdate.ItemComposition_get(var3).getIntParam(var4, var5.defaultInt); // L: 4584
							}

							return 1; // L: 4586
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) { // L: 4588
							Interpreter.Interpreter_intStackSize -= 2; // L: 4589
							var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4590
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4591
							var5 = class33.getParamDefinition(var4); // L: 4592
							if (var5.isString()) { // L: 4593
								Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = class195.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 4594
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class195.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 4597
							}

							return 1; // L: 4599
						} else if (var0 == ScriptOpcodes.ON_MOBILE) { // L: 4601
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0; // L: 4602
							return 1; // L: 4603
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) { // L: 4605
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.clientType; // L: 4606
							return 1; // L: 4607
						} else if (var0 == 6520) { // L: 4609
							return 1; // L: 4610
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) { // L: 4612
							return 1; // L: 4613
						} else if (var0 == 6522) { // L: 4615
							--SecureRandomCallable.Interpreter_stringStackSize; // L: 4616
							--Interpreter.Interpreter_intStackSize; // L: 4617
							return 1; // L: 4618
						} else if (var0 == 6523) { // L: 4620
							--SecureRandomCallable.Interpreter_stringStackSize; // L: 4621
							--Interpreter.Interpreter_intStackSize; // L: 4622
							return 1; // L: 4623
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYLEVEL) { // L: 4625
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4626
							return 1; // L: 4627
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYCHARGING) { // L: 4629
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 4630
							return 1; // L: 4631
						} else if (var0 == ScriptOpcodes.MOBILE_WIFIAVAILABLE) { // L: 4633
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 4634
							return 1; // L: 4635
						} else if (var0 == 6527) { // L: 4637
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field495; // L: 4638
							return 1; // L: 4639
						} else {
							return 2; // L: 4641
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4525
					if (var3 >= 0 && var3 < World.World_count) { // L: 4526
						var7 = class31.World_worlds[var3]; // L: 4527
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.id; // L: 4528
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.properties; // L: 4529
						Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var7.activity; // L: 4530
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.location; // L: 4531
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.population; // L: 4532
						Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var7.host; // L: 4533
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4536
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4537
						Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = ""; // L: 4538
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4539
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4540
						Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = ""; // L: 4541
					}

					return 1; // L: 4543
				}
			}
		}
	}
}

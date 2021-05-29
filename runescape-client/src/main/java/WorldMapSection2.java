import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fb")
@Implements("WorldMapSection2")
public class WorldMapSection2 implements WorldMapSection {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1405879659
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1291885051
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1139978387
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1146438231
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -144912345
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -720689063
	)
	@Export("regionEndY")
	int regionEndY;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -18859023
	)
	int field1952;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1614238823
	)
	int field1947;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -120763515
	)
	int field1946;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1556024609
	)
	int field1955;

	WorldMapSection2() {
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lfo;I)V",
		garbageValue = "1120913212"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field1952) {
			var1.regionLowX = this.field1952;
		}

		if (var1.regionHighX < this.field1946) {
			var1.regionHighX = this.field1946;
		}

		if (var1.regionLowY > this.field1947) {
			var1.regionLowY = this.field1947;
		}

		if (var1.regionHighY < this.field1955) {
			var1.regionHighY = this.field1955;
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "264048682"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.planes + this.minPlane) {
			return var2 >> 6 >= this.regionStartX && var2 >> 6 <= this.regionEndX && var3 >> 6 >= this.regionStartY && var3 >> 6 <= this.regionEndY;
		} else {
			return false;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-11"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 >= this.field1952 && var1 >> 6 <= this.field1946 && var2 >> 6 >= this.field1947 && var2 >> 6 <= this.field1955;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "1943891890"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{this.field1952 * 64 - this.regionStartX * 64 + var2, var3 + (this.field1947 * 64 - this.regionStartY * 64)};
			return var4;
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(III)Lii;",
		garbageValue = "691158162"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.regionStartX * 64 - this.field1952 * 64 + var1;
			int var4 = this.regionStartY * 64 - this.field1947 * 64 + var2;
			return new Coord(this.minPlane, var3, var4);
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "-1138667895"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte();
		this.planes = var1.readUnsignedByte();
		this.regionStartX = var1.readUnsignedShort();
		this.regionStartY = var1.readUnsignedShort();
		this.regionEndX = var1.readUnsignedShort();
		this.regionEndY = var1.readUnsignedShort();
		this.field1952 = var1.readUnsignedShort();
		this.field1947 = var1.readUnsignedShort();
		this.field1946 = var1.readUnsignedShort();
		this.field1955 = var1.readUnsignedShort();
		this.postRead();
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1294582509"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "-2037016852"
	)
	static int method3257(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTCLOCK) {
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Client.cycle;
			return 1;
		} else {
			int var3;
			int var4;
			if (var0 == ScriptOpcodes.INV_GETOBJ) {
				class44.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = GameEngine.method538(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_GETNUM) {
				class44.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = class20.ItemContainer_getCount(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_TOTAL) {
				class44.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = LoginScreenAnimation.method2235(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_SIZE) {
				var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = GrandExchangeOfferOwnWorldComparator.getInvDefinition(var3).size;
				return 1;
			} else if (var0 == ScriptOpcodes.STAT) {
				var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Client.currentLevels[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.STAT_BASE) {
				var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Client.levels[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.STAT_XP) {
				var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Client.experience[var3];
				return 1;
			} else {
				int var5;
				if (var0 == ScriptOpcodes.COORD) {
					var3 = class22.Client_plane;
					var4 = VertexNormal.baseX * 64 + (class93.localPlayer.x >> 7);
					var5 = SoundSystem.baseY * 64 + (class93.localPlayer.y >> 7);
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = (var4 << 14) + var5 + (var3 << 28);
					return 1;
				} else if (var0 == ScriptOpcodes.COORDX) {
					var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3 >> 14 & 16383;
					return 1;
				} else if (var0 == ScriptOpcodes.COORDZ) {
					var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3 >> 28;
					return 1;
				} else if (var0 == ScriptOpcodes.COORDY) {
					var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3 & 16383;
					return 1;
				} else if (var0 == ScriptOpcodes.MAP_MEMBERS) {
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) {
					class44.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = GameEngine.method538(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) {
					class44.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = class20.ItemContainer_getCount(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) {
					class44.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = LoginScreenAnimation.method2235(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.STAFFMODLEVEL) {
					if (Client.staffModLevel >= 2) {
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Client.staffModLevel;
					} else {
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.REBOOTTIMER) {
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Client.rebootTimer;
					return 1;
				} else if (var0 == ScriptOpcodes.MAP_WORLD) {
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Client.worldId;
					return 1;
				} else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) {
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Client.runEnergy;
					return 1;
				} else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) {
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Client.weight;
					return 1;
				} else if (var0 == ScriptOpcodes.PLAYERMOD) {
					if (Client.playerMod) {
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.WORLDFLAGS) {
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Client.worldProperties;
					return 1;
				} else if (var0 == ScriptOpcodes.MOVECOORD) {
					class44.Interpreter_intStackSize -= 4;
					var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize];
					var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 2];
					int var6 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 3];
					var3 += var4 << 14;
					var3 += var5 << 28;
					var3 += var6;
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3;
					return 1;
				} else if (var0 == 3326) {
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Client.field651;
					return 1;
				} else if (var0 == 3327) {
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Client.field812;
					return 1;
				} else {
					return 2;
				}
			}
		}
	}
}

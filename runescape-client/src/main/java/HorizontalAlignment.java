import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jt")
@Implements("HorizontalAlignment")
public enum HorizontalAlignment implements Enumerated {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "Ljt;"
	)
	field3490(2, 0),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "Ljt;"
	)
	@Export("HorizontalAlignment_centered")
	HorizontalAlignment_centered(1, 1),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "Ljt;"
	)
	field3491(0, 2);

	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1422973227
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 2073239653
	)
	@Export("id")
	final int id;

	HorizontalAlignment(int var3, int var4) {
		this.value = var3;
		this.id = var4;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-275768542"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		signature = "(ILcs;ZB)I",
		garbageValue = "4"
	)
	static int method4729(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) {
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = GrandExchangeEvent.loadWorlds() ? 1 : 0;
			return 1;
		} else {
			World var3;
			if (var0 == ScriptOpcodes.WORLDLIST_START) {
				var3 = class236.worldListStart();
				if (var3 != null) {
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3.id;
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3.properties;
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.activity;
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3.location;
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3.population;
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.host;
				} else {
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1;
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) {
				var3 = GrandExchangeEvents.getNextWorldListWorld();
				if (var3 != null) {
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3.id;
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3.properties;
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.activity;
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3.location;
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3.population;
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.host;
				} else {
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1;
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else {
				World var4;
				int var5;
				int var7;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) {
					var7 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
					var4 = null;

					for (var5 = 0; var5 < World.World_count; ++var5) {
						if (var7 == World.World_worlds[var5].id) {
							var4 = World.World_worlds[var5];
							break;
						}
					}

					if (var4 != null) {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var4.id;
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var4.properties;
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.activity;
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var4.location;
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var4.population;
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.host;
					} else {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) {
					VarcInt.Interpreter_intStackSize -= 4;
					var7 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize];
					boolean var10 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1] == 1;
					var5 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 2];
					boolean var6 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 3] == 1;
					TaskHandler.sortWorldList(var7, var10, var5, var6);
					return 1;
				} else if (var0 != ScriptOpcodes.GETWORLDINFO) {
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) {
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1;
						return 1;
					} else {
						int var8;
						ParamComposition var9;
						if (var0 == ScriptOpcodes.NC_PARAM) {
							VarcInt.Interpreter_intStackSize -= 2;
							var7 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize];
							var8 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1];
							var9 = ChatChannel.getParamDefinition(var8);
							if (var9.isString()) {
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = WorldMapIcon_0.getNpcDefinition(var7).getStringParam(var8, var9.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = WorldMapIcon_0.getNpcDefinition(var7).getIntParam(var8, var9.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.LC_PARAM) {
							VarcInt.Interpreter_intStackSize -= 2;
							var7 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize];
							var8 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1];
							var9 = ChatChannel.getParamDefinition(var8);
							if (var9.isString()) {
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = WorldMapDecoration.getObjectDefinition(var7).getStringParam(var8, var9.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = WorldMapDecoration.getObjectDefinition(var7).getIntParam(var8, var9.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.OC_PARAM) {
							VarcInt.Interpreter_intStackSize -= 2;
							var7 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize];
							var8 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1];
							var9 = ChatChannel.getParamDefinition(var8);
							if (var9.isString()) {
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = SecureRandomCallable.ItemDefinition_get(var7).getStringParam(var8, var9.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = SecureRandomCallable.ItemDefinition_get(var7).getIntParam(var8, var9.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) {
							VarcInt.Interpreter_intStackSize -= 2;
							var7 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize];
							var8 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1];
							var9 = ChatChannel.getParamDefinition(var8);
							if (var9.isString()) {
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = AbstractWorldMapIcon.StructDefinition_getStructDefinition(var7).getStringParam(var8, var9.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = AbstractWorldMapIcon.StructDefinition_getStructDefinition(var7).getIntParam(var8, var9.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.ON_MOBILE) {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Client.clientType & 3;
							return 1;
						} else if (var0 == 6520) {
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) {
							return 1;
						} else if (var0 == 6522) {
							--Interpreter.Interpreter_stringStackSize;
							--VarcInt.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 6523) {
							--Interpreter.Interpreter_stringStackSize;
							--VarcInt.Interpreter_intStackSize;
							return 1;
						} else if (var0 == ScriptOpcodes.BATTERYLEVEL) {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1;
							return 1;
						} else if (var0 == ScriptOpcodes.BATTERYCHARGING) {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 1;
							return 1;
						} else if (var0 == ScriptOpcodes.WIFIAVAILABLE) {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 1;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var7 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
					if (var7 >= 0 && var7 < World.World_count) {
						var4 = World.World_worlds[var7];
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var4.id;
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var4.properties;
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.activity;
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var4.location;
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var4.population;
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.host;
					} else {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				}
			}
		}
	}
}

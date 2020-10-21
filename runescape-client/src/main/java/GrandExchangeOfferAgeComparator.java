import java.io.IOException;
import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("d")
@Implements("GrandExchangeOfferAgeComparator")
final class GrandExchangeOfferAgeComparator implements Comparator {
	@ObfuscatedName("sk")
	@ObfuscatedSignature(
		signature = "Lcp;"
	)
	@Export("clientPreferences")
	static ClientPreferences clientPreferences;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "Liw;"
	)
	@Export("ObjectDefinition_modelsArchive")
	public static AbstractArchive ObjectDefinition_modelsArchive;

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Ly;Ly;B)I",
		garbageValue = "-94"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.age < var2.age ? -1 : (var2.age == var1.age ? 0 : 1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;I)V",
		garbageValue = "65677327"
	)
	static final void method241(String var0) {
		StringBuilder var10000 = new StringBuilder();
		Object var10001 = null;
		var10000 = var10000.append("Please remove ").append(var0);
		var10001 = null;
		String var1 = var10000.append(" from your ignore list first").toString();
		DevicePcmPlayerProvider.addGameMessage(30, "", var1);
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1203523043"
	)
	public static void method242() {
		HitSplatDefinition.HitSplatDefinition_cached.clear();
		HitSplatDefinition.HitSplatDefinition_cachedSprites.clear();
		HitSplatDefinition.HitSplatDefinition_cachedFonts.clear();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		signature = "(ILco;ZI)I",
		garbageValue = "-695150363"
	)
	static int method240(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) {
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = WallDecoration.loadWorlds() ? 1 : 0;
			return 1;
		} else {
			World var3;
			if (var0 == ScriptOpcodes.WORLDLIST_START) {
				var3 = ModelData0.worldListStart();
				if (var3 != null) {
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.id;
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.properties;
					Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var3.activity;
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.location;
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.population;
					Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var3.host;
				} else {
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = -1;
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) {
				var3 = FileSystem.getNextWorldListWorld();
				if (var3 != null) {
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.id;
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.properties;
					Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var3.activity;
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.location;
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.population;
					Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var3.host;
				} else {
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = -1;
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else {
				World var4;
				int var5;
				int var7;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) {
					var7 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
					var4 = null;

					for (var5 = 0; var5 < World.World_count; ++var5) {
						if (var7 == DefaultsGroup.World_worlds[var5].id) {
							var4 = DefaultsGroup.World_worlds[var5];
							break;
						}
					}

					if (var4 != null) {
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var4.id;
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var4.properties;
						Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var4.activity;
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var4.location;
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var4.population;
						Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var4.host;
					} else {
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) {
					MilliClock.Interpreter_intStackSize -= 4;
					var7 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize];
					boolean var10 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1] == 1;
					var5 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 2];
					boolean var6 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 3] == 1;
					World.sortWorldList(var7, var10, var5, var6);
					return 1;
				} else if (var0 != ScriptOpcodes.GETWORLDINFO) {
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) {
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1;
						return 1;
					} else {
						int var8;
						ParamDefinition var9;
						if (var0 == ScriptOpcodes.NC_PARAM) {
							MilliClock.Interpreter_intStackSize -= 2;
							var7 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize];
							var8 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1];
							var9 = TileItem.getParamDefinition(var8);
							if (var9.isString()) {
								Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = Clock.getNpcDefinition(var7).getStringParam(var8, var9.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Clock.getNpcDefinition(var7).getIntParam(var8, var9.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.LC_PARAM) {
							MilliClock.Interpreter_intStackSize -= 2;
							var7 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize];
							var8 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1];
							var9 = TileItem.getParamDefinition(var8);
							if (var9.isString()) {
								Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = ScriptEvent.getObjectDefinition(var7).getStringParam(var8, var9.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = ScriptEvent.getObjectDefinition(var7).getIntParam(var8, var9.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.OC_PARAM) {
							MilliClock.Interpreter_intStackSize -= 2;
							var7 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize];
							var8 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1];
							var9 = TileItem.getParamDefinition(var8);
							if (var9.isString()) {
								Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = AbstractWorldMapData.ItemDefinition_get(var7).getStringParam(var8, var9.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = AbstractWorldMapData.ItemDefinition_get(var7).getIntParam(var8, var9.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) {
							MilliClock.Interpreter_intStackSize -= 2;
							var7 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize];
							var8 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1];
							var9 = TileItem.getParamDefinition(var8);
							if (var9.isString()) {
								Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = ClientPacket.StructDefinition_getStructDefinition(var7).getStringParam(var8, var9.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = ClientPacket.StructDefinition_getStructDefinition(var7).getIntParam(var8, var9.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.ON_MOBILE) {
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) {
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Client.clientType & 3;
							return 1;
						} else if (var0 == 6520) {
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) {
							return 1;
						} else if (var0 == 6522) {
							--UrlRequester.Interpreter_stringStackSize;
							--MilliClock.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 6523) {
							--UrlRequester.Interpreter_stringStackSize;
							--MilliClock.Interpreter_intStackSize;
							return 1;
						} else if (var0 == ScriptOpcodes.BATTERYLEVEL) {
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = -1;
							return 1;
						} else if (var0 == ScriptOpcodes.BATTERYCHARGING) {
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 1;
							return 1;
						} else if (var0 == ScriptOpcodes.WIFIAVAILABLE) {
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 1;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var7 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
					if (var7 >= 0 && var7 < World.World_count) {
						var4 = DefaultsGroup.World_worlds[var7];
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var4.id;
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var4.properties;
						Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var4.activity;
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var4.location;
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var4.population;
						Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var4.host;
					} else {
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		signature = "(ZI)V",
		garbageValue = "487407566"
	)
	static final void method243(boolean var0) {
		FriendSystem.playPcmPlayers();
		++Client.packetWriter.pendingWrites;
		if (Client.packetWriter.pendingWrites >= 50 || var0) {
			Client.packetWriter.pendingWrites = 0;
			if (!Client.field730 && Client.packetWriter.getSocket() != null) {
				PacketBufferNode var1 = class4.getPacketBufferNode(ClientPacket.field2247, Client.packetWriter.isaacCipher);
				Client.packetWriter.addNode(var1);

				try {
					Client.packetWriter.flush();
				} catch (IOException var3) {
					Client.field730 = true;
				}
			}

		}
	}
}

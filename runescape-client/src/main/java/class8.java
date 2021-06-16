import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("h")
public class class8 extends class14 {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		longValue = 2367979421742745425L
	)
	long field59;
	@ObfuscatedName("e")
	String field60;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lv;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lv;)V"
	)
	class8(class2 var1) {
		this.this$0 = var1;
		this.field59 = -1L;
		this.field60 = null;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "73833784"
	)
	void vmethod363(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field59 = var1.readLong();
		}

		this.field60 = var1.readStringCp1252NullTerminatedOrNull();
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lb;I)V",
		garbageValue = "1885623446"
	)
	void vmethod354(ClanSettings var1) {
		var1.method126(this.field59, this.field60, 0);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-128382641"
	)
	public static int method104(int var0) {
		return var0 >> 17 & 7;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZI)I",
		garbageValue = "1957308272"
	)
	static int method105(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) {
			boolean var3 = false;
			boolean var4 = false;
			int var5 = 0;
			int var6 = var0.length();

			for (int var7 = 0; var7 < var6; ++var7) {
				char var8 = var0.charAt(var7);
				if (var7 == 0) {
					if (var8 == '-') {
						var3 = true;
						continue;
					}

					if (var8 == '+') {
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') {
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') {
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') {
						throw new NumberFormatException();
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) {
					throw new NumberFormatException();
				}

				if (var3) {
					var10 = -var10;
				}

				int var9 = var10 + var5 * var1;
				if (var9 / var1 != var5) {
					throw new NumberFormatException();
				}

				var5 = var9;
				var4 = true;
			}

			if (!var4) {
				throw new NumberFormatException();
			} else {
				return var5;
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-39"
	)
	static final boolean method103() {
		return ViewportMouse.ViewportMouse_isInViewport;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "1054679248"
	)
	static int method102(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) {
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = FaceNormal.loadWorlds() ? 1 : 0;
			return 1;
		} else {
			World var9;
			if (var0 == ScriptOpcodes.WORLDLIST_START) {
				var9 = DevicePcmPlayerProvider.worldListStart();
				if (var9 != null) {
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var9.id;
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var9.properties;
					Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var9.activity;
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var9.location;
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var9.population;
					Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var9.host;
				} else {
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1;
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) {
				var9 = Client.getNextWorldListWorld();
				if (var9 != null) {
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var9.id;
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var9.properties;
					Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var9.activity;
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var9.location;
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var9.population;
					Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var9.host;
				} else {
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1;
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else {
				int var3;
				World var7;
				int var8;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) {
					var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
					var7 = null;

					for (var8 = 0; var8 < World.World_count; ++var8) {
						if (var3 == World.World_worlds[var8].id) {
							var7 = World.World_worlds[var8];
							break;
						}
					}

					if (var7 != null) {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var7.id;
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var7.properties;
						Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var7.activity;
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var7.location;
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var7.population;
						Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var7.host;
					} else {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) {
					ChatChannel.Interpreter_intStackSize -= 4;
					var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize];
					boolean var10 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1] == 1;
					var8 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 2];
					boolean var6 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 3] == 1;
					WorldMapSectionType.sortWorldList(var3, var10, var8, var6);
					return 1;
				} else if (var0 != ScriptOpcodes.GETWORLDINFO) {
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) {
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1;
						return 1;
					} else {
						int var4;
						ParamComposition var5;
						if (var0 == ScriptOpcodes.NC_PARAM) {
							ChatChannel.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1];
							var5 = UserComparator10.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = class248.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = class248.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.LC_PARAM) {
							ChatChannel.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1];
							var5 = UserComparator10.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = Tiles.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Tiles.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.OC_PARAM) {
							ChatChannel.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1];
							var5 = UserComparator10.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = class250.ItemDefinition_get(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = class250.ItemDefinition_get(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) {
							ChatChannel.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1];
							var5 = UserComparator10.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = UserComparator10.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = UserComparator10.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.ON_MOBILE) {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Client.clientType & 3;
							return 1;
						} else if (var0 == 6520) {
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) {
							return 1;
						} else if (var0 == 6522) {
							--UserComparator9.Interpreter_stringStackSize;
							--ChatChannel.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 6523) {
							--UserComparator9.Interpreter_stringStackSize;
							--ChatChannel.Interpreter_intStackSize;
							return 1;
						} else if (var0 == ScriptOpcodes.BATTERYLEVEL) {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1;
							return 1;
						} else if (var0 == ScriptOpcodes.BATTERYCHARGING) {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 1;
							return 1;
						} else if (var0 == ScriptOpcodes.WIFIAVAILABLE) {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 1;
							return 1;
						} else if (var0 == 6527) {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Client.field625;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
					if (var3 >= 0 && var3 < World.World_count) {
						var7 = World.World_worlds[var3];
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var7.id;
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var7.properties;
						Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var7.activity;
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var7.location;
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var7.population;
						Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var7.host;
					} else {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1771393574"
	)
	@Export("runIntfCloseListeners")
	static final void runIntfCloseListeners(int var0, int var1) {
		if (class20.loadInterface(var0)) {
			JagexCache.runComponentCloseListeners(GrandExchangeOfferOwnWorldComparator.Widget_interfaceComponents[var0], var1);
		}
	}
}

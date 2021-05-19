import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cr")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
	@ObfuscatedName("h")
	@Export("isRunning")
	boolean isRunning;
	@ObfuscatedName("c")
	@Export("lock")
	Object lock;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1951116577
	)
	@Export("index")
	int index;
	@ObfuscatedName("g")
	@Export("xs")
	int[] xs;
	@ObfuscatedName("l")
	@Export("ys")
	int[] ys;
	@ObfuscatedName("z")
	@Export("millis")
	long[] millis;

	MouseRecorder() {
		this.isRunning = true;
		this.lock = new Object();
		this.index = 0;
		this.xs = new int[500];
		this.ys = new int[500];
		this.millis = new long[500];
	}

	public void run() {
		for (; this.isRunning; UrlRequest.sleepExact(50L)) {
			synchronized(this.lock) {
				if (this.index < 500) {
					this.xs[this.index] = MouseHandler.MouseHandler_x;
					this.ys[this.index] = MouseHandler.MouseHandler_y;
					this.millis[this.index] = MouseHandler.MouseHandler_millis;
					++this.index;
				}
			}
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljp;Ljava/lang/String;Ljava/lang/String;IZB)V",
		garbageValue = "-90"
	)
	public static void method2124(AbstractArchive var0, String var1, String var2, int var3, boolean var4) {
		int var5 = var0.getGroupId(var1);
		int var6 = var0.getFileId(var5, var2);
		World.method1684(var0, var5, var6, var3, var4);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-975055690"
	)
	public static int method2126(int var0) {
		--var0;
		var0 |= var0 >>> 1;
		var0 |= var0 >>> 2;
		var0 |= var0 >>> 4;
		var0 |= var0 >>> 8;
		var0 |= var0 >>> 16;
		return var0 + 1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILci;ZI)I",
		garbageValue = "2105644144"
	)
	static int method2125(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) {
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = PrivateChatMode.loadWorlds() ? 1 : 0;
			return 1;
		} else {
			World var9;
			if (var0 == ScriptOpcodes.WORLDLIST_START) {
				var9 = class21.worldListStart();
				if (var9 != null) {
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var9.id;
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var9.properties;
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var9.activity;
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var9.location;
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var9.population;
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var9.host;
				} else {
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = -1;
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) {
				var9 = class13.getNextWorldListWorld();
				if (var9 != null) {
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var9.id;
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var9.properties;
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var9.activity;
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var9.location;
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var9.population;
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var9.host;
				} else {
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = -1;
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else {
				int var3;
				World var7;
				int var8;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) {
					var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
					var7 = null;

					for (var8 = 0; var8 < World.World_count; ++var8) {
						if (var3 == Messages.World_worlds[var8].id) {
							var7 = Messages.World_worlds[var8];
							break;
						}
					}

					if (var7 != null) {
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var7.id;
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var7.properties;
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var7.activity;
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var7.location;
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var7.population;
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var7.host;
					} else {
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) {
					WorldMapCacheName.Interpreter_intStackSize -= 4;
					var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize];
					boolean var10 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1] == 1;
					var8 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 2];
					boolean var6 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 3] == 1;
					GrandExchangeEvents.sortWorldList(var3, var10, var8, var6);
					return 1;
				} else if (var0 != ScriptOpcodes.GETWORLDINFO) {
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) {
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1;
						return 1;
					} else {
						int var4;
						ParamComposition var5;
						if (var0 == ScriptOpcodes.NC_PARAM) {
							WorldMapCacheName.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1];
							var5 = WorldMapElement.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = class8.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = class8.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.LC_PARAM) {
							WorldMapCacheName.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1];
							var5 = WorldMapElement.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = AttackOption.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = AttackOption.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.OC_PARAM) {
							WorldMapCacheName.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1];
							var5 = WorldMapElement.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = Strings.ItemDefinition_get(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Strings.ItemDefinition_get(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) {
							WorldMapCacheName.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1];
							var5 = WorldMapElement.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = class229.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = class229.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.ON_MOBILE) {
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) {
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Client.clientType & 3;
							return 1;
						} else if (var0 == 6520) {
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) {
							return 1;
						} else if (var0 == 6522) {
							--class13.Interpreter_stringStackSize;
							--WorldMapCacheName.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 6523) {
							--class13.Interpreter_stringStackSize;
							--WorldMapCacheName.Interpreter_intStackSize;
							return 1;
						} else if (var0 == ScriptOpcodes.BATTERYLEVEL) {
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = -1;
							return 1;
						} else if (var0 == ScriptOpcodes.BATTERYCHARGING) {
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 1;
							return 1;
						} else if (var0 == ScriptOpcodes.WIFIAVAILABLE) {
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 1;
							return 1;
						} else if (var0 == 6527) {
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Client.field621;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
					if (var3 >= 0 && var3 < World.World_count) {
						var7 = Messages.World_worlds[var3];
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var7.id;
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var7.properties;
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var7.activity;
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var7.location;
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var7.population;
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var7.host;
					} else {
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				}
			}
		}
	}
}

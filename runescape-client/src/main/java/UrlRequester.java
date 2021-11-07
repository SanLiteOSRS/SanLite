import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cf")
@Implements("UrlRequester")
public class UrlRequester implements Runnable {
	@ObfuscatedName("g")
	@Export("SpriteBuffer_spriteWidths")
	public static int[] SpriteBuffer_spriteWidths;
	@ObfuscatedName("i")
	@Export("thread")
	final Thread thread;
	@ObfuscatedName("w")
	@Export("isClosed")
	volatile boolean isClosed;
	@ObfuscatedName("s")
	@Export("requests")
	Queue requests;

	public UrlRequester() {
		this.requests = new LinkedList();
		this.thread = new Thread(this);
		this.thread.setPriority(1);
		this.thread.start();
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;B)Lcm;",
		garbageValue = "56"
	)
	@Export("request")
	public UrlRequest request(URL var1) {
		UrlRequest var2 = new UrlRequest(var1);
		synchronized(this) {
			this.requests.add(var2);
			this.notify();
			return var2;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "103"
	)
	@Export("close")
	public void close() {
		this.isClosed = true;

		try {
			synchronized(this) {
				this.notify();
			}

			this.thread.join();
		} catch (InterruptedException var4) {
		}

	}

	public void run() {
		while (!this.isClosed) {
			try {
				UrlRequest var1;
				synchronized(this) {
					var1 = (UrlRequest)this.requests.poll();
					if (var1 == null) {
						try {
							this.wait();
						} catch (InterruptedException var13) {
						}
						continue;
					}
				}

				DataInputStream var2 = null;
				URLConnection var3 = null;

				try {
					var3 = var1.url.openConnection();
					var3.setConnectTimeout(5000);
					var3.setReadTimeout(5000);
					var3.setUseCaches(false);
					var3.setRequestProperty("Connection", "close");
					int var7 = var3.getContentLength();
					if (var7 >= 0) {
						byte[] var5 = new byte[var7];
						var2 = new DataInputStream(var3.getInputStream());
						var2.readFully(var5);
						var1.response0 = var5;
					}

					var1.isDone0 = true;
				} catch (IOException var14) {
					var1.isDone0 = true;
				} finally {
					if (var2 != null) {
						var2.close();
					}

					if (var3 != null && var3 instanceof HttpURLConnection) {
						((HttpURLConnection)var3).disconnect();
					}

				}
			} catch (Exception var17) {
				MilliClock.RunException_sendStackTrace((String)null, var17);
			}
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZI)I",
		garbageValue = "-1444939304"
	)
	static int method2427(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTCLOCK) {
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.cycle;
			return 1;
		} else {
			int var3;
			int var4;
			if (var0 == ScriptOpcodes.INV_GETOBJ) {
				class14.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Script.method1988(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_GETNUM) {
				class14.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = ScriptFrame.ItemContainer_getCount(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_TOTAL) {
				class14.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = WorldMapSectionType.method3920(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_SIZE) {
				var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = AttackOption.getInvDefinition(var3).size;
				return 1;
			} else if (var0 == ScriptOpcodes.STAT) {
				var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.currentLevels[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.STAT_BASE) {
				var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.levels[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.STAT_XP) {
				var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.experience[var3];
				return 1;
			} else {
				int var5;
				if (var0 == ScriptOpcodes.COORD) {
					var3 = GrandExchangeOfferTotalQuantityComparator.Client_plane;
					var4 = class19.baseX * 64 + (HealthBarDefinition.localPlayer.x >> 7);
					var5 = DefaultsGroup.baseY * 64 + (HealthBarDefinition.localPlayer.y >> 7);
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = (var4 << 14) + var5 + (var3 << 28);
					return 1;
				} else if (var0 == ScriptOpcodes.COORDX) {
					var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3 >> 14 & 16383;
					return 1;
				} else if (var0 == ScriptOpcodes.COORDZ) {
					var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3 >> 28;
					return 1;
				} else if (var0 == ScriptOpcodes.COORDY) {
					var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3 & 16383;
					return 1;
				} else if (var0 == ScriptOpcodes.MAP_MEMBERS) {
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) {
					class14.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Script.method1988(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) {
					class14.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = ScriptFrame.ItemContainer_getCount(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) {
					class14.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = WorldMapSectionType.method3920(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.STAFFMODLEVEL) {
					if (Client.staffModLevel >= 2) {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.staffModLevel;
					} else {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.REBOOTTIMER) {
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.rebootTimer;
					return 1;
				} else if (var0 == ScriptOpcodes.MAP_WORLD) {
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.worldId;
					return 1;
				} else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) {
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.runEnergy;
					return 1;
				} else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) {
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.weight;
					return 1;
				} else if (var0 == ScriptOpcodes.PLAYERMOD) {
					if (Client.playerMod) {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.WORLDFLAGS) {
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.worldProperties;
					return 1;
				} else if (var0 == ScriptOpcodes.MOVECOORD) {
					class14.Interpreter_intStackSize -= 4;
					var3 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize];
					var4 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 2];
					int var6 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 3];
					var3 += var4 << 14;
					var3 += var5 << 28;
					var3 += var6;
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3;
					return 1;
				} else if (var0 == 3326) {
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.field475;
					return 1;
				} else if (var0 == 3327) {
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.field476;
					return 1;
				} else {
					return 2;
				}
			}
		}
	}
}

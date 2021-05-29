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

@ObfuscatedName("do")
@Implements("UrlRequester")
public class UrlRequester implements Runnable {
	@ObfuscatedName("e")
	static int[][][] field1419;
	@ObfuscatedName("v")
	@Export("thread")
	final Thread thread;
	@ObfuscatedName("n")
	@Export("isClosed")
	volatile boolean isClosed;
	@ObfuscatedName("f")
	@Export("requests")
	Queue requests;

	public UrlRequester() {
		this.requests = new LinkedList();
		this.thread = new Thread(this);
		this.thread.setPriority(1);
		this.thread.start();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;I)Ldf;",
		garbageValue = "-1811269491"
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

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "279229859"
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
				class266.RunException_sendStackTrace((String)null, var17);
			}
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "1175355119"
	)
	static int method2420(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) {
			class44.Interpreter_intStackSize -= 2;
			Client.field894 = (short)class43.method436(Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]);
			if (Client.field894 <= 0) {
				Client.field894 = 256;
			}

			Client.field895 = (short)class43.method436(Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]);
			if (Client.field895 <= 0) {
				Client.field895 = 256;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) {
			class44.Interpreter_intStackSize -= 2;
			Client.zoomHeight = (short)Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize];
			if (Client.zoomHeight <= 0) {
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = (short)Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1];
			if (Client.zoomWidth <= 0) {
				Client.zoomWidth = 320;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) {
			class44.Interpreter_intStackSize -= 4;
			Client.field909 = (short)Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize];
			if (Client.field909 <= 0) {
				Client.field909 = 1;
			}

			Client.field828 = (short)Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1];
			if (Client.field828 <= 0) {
				Client.field828 = 32767;
			} else if (Client.field828 < Client.field909) {
				Client.field828 = Client.field909;
			}

			Client.field900 = (short)Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 2];
			if (Client.field900 <= 0) {
				Client.field900 = 1;
			}

			Client.field901 = (short)Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 3];
			if (Client.field901 <= 0) {
				Client.field901 = 32767;
			} else if (Client.field901 < Client.field900) {
				Client.field901 = Client.field900;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) {
			if (Client.viewportWidget != null) {
				setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false);
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Client.viewportWidth;
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Client.viewportHeight;
			} else {
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -1;
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -1;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) {
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Client.zoomHeight;
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Client.zoomWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) {
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = UserComparator9.method2467(Client.field894);
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = UserComparator9.method2467(Client.field895);
			return 1;
		} else if (var0 == 6220) {
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6221) {
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6222) {
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = class32.canvasWidth;
			return 1;
		} else if (var0 == 6223) {
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = ReflectionCheck.canvasHeight;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "1159694527"
	)
	@Export("setViewportShape")
	static final void setViewportShape(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) {
			var2 = 1;
		}

		if (var3 < 1) {
			var3 = 1;
		}

		int var5 = var3 - 334;
		int var6;
		if (var5 < 0) {
			var6 = Client.field894;
		} else if (var5 >= 100) {
			var6 = Client.field895;
		} else {
			var6 = (Client.field895 - Client.field894) * var5 / 100 + Client.field894;
		}

		int var7 = var3 * var6 * 512 / (var2 * 334);
		int var8;
		int var9;
		short var10;
		if (var7 < Client.field900) {
			var10 = Client.field900;
			var6 = var10 * var2 * 334 / (var3 * 512);
			if (var6 > Client.field828) {
				var6 = Client.field828;
				var8 = var3 * var6 * 512 / (var10 * 334);
				var9 = (var2 - var8) / 2;
				if (var4) {
					Rasterizer2D.Rasterizer2D_resetClip();
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216);
					Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216);
				}

				var0 += var9;
				var2 -= var9 * 2;
			}
		} else if (var7 > Client.field901) {
			var10 = Client.field901;
			var6 = var10 * var2 * 334 / (var3 * 512);
			if (var6 < Client.field909) {
				var6 = Client.field909;
				var8 = var10 * var2 * 334 / (var6 * 512);
				var9 = (var3 - var8) / 2;
				if (var4) {
					Rasterizer2D.Rasterizer2D_resetClip();
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var9, -16777216);
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var3 + var1 - var9, var2, var9, -16777216);
				}

				var1 += var9;
				var3 -= var9 * 2;
			}
		}

		Client.viewportZoom = var3 * var6 / 334;
		if (var2 != Client.viewportWidth || var3 != Client.viewportHeight) {
			class17.method209(var2, var3);
		}

		Client.viewportOffsetX = var0;
		Client.viewportOffsetY = var1;
		Client.viewportWidth = var2;
		Client.viewportHeight = var3;
	}
}

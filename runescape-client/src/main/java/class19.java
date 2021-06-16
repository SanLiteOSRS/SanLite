import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("s")
public class class19 {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		longValue = 2755229533790487225L
	)
	long field155;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		longValue = -2197636962351973129L
	)
	long field152;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	IterableNodeDeque field153;

	@ObfuscatedSignature(
		descriptor = "(Lnt;)V"
	)
	public class19(Buffer var1) {
		this.field152 = -1L;
		this.field153 = new IterableNodeDeque();
		this.method277(var1);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "-1965655263"
	)
	void method277(Buffer var1) {
		this.field155 = var1.readLong();
		this.field152 = var1.readLong();

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
			Object var3;
			if (var2 == 1) {
				var3 = new class12(this);
			} else if (var2 == 4) {
				var3 = new class7(this);
			} else if (var2 == 3) {
				var3 = new class5(this);
			} else if (var2 == 2) {
				var3 = new class20(this);
			} else {
				if (var2 != 5) {
					throw new RuntimeException("");
				}

				var3 = new class25(this);
			}

			((class16)var3).vmethod331(var1);
			this.field153.addFirst((Node)var3);
		}

	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ly;I)V",
		garbageValue = "-11264917"
	)
	public void method278(ClanChannel var1) {
		if (var1.key == this.field155 && var1.field25 == this.field152) {
			for (class16 var2 = (class16)this.field153.last(); var2 != null; var2 = (class16)this.field153.previous()) {
				var2.vmethod332(var1);
			}

			++var1.field25;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnt;Lmo;I)Lmo;",
		garbageValue = "1921289241"
	)
	@Export("readStringIntParameters")
	static final IterableNodeHashTable readStringIntParameters(Buffer var0, IterableNodeHashTable var1) {
		int var2 = var0.readUnsignedByte();
		int var3;
		if (var1 == null) {
			var3 = UrlRequester.method2504(var2);
			var1 = new IterableNodeHashTable(var3);
		}

		for (var3 = 0; var3 < var2; ++var3) {
			boolean var4 = var0.readUnsignedByte() == 1;
			int var5 = var0.readMedium();
			Object var6;
			if (var4) {
				var6 = new ObjectNode(var0.readStringCp1252NullTerminated());
			} else {
				var6 = new IntegerNode(var0.readInt());
			}

			var1.put((Node)var6, (long)var5);
		}

		return var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZB)I",
		garbageValue = "6"
	)
	static int method276(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) {
			ChatChannel.Interpreter_intStackSize -= 2;
			Client.field876 = (short)ScriptFrame.method1233(Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]);
			if (Client.field876 <= 0) {
				Client.field876 = 256;
			}

			Client.field877 = (short)ScriptFrame.method1233(Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]);
			if (Client.field877 <= 0) {
				Client.field877 = 256;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) {
			ChatChannel.Interpreter_intStackSize -= 2;
			Client.zoomHeight = (short)Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize];
			if (Client.zoomHeight <= 0) {
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = (short)Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1];
			if (Client.zoomWidth <= 0) {
				Client.zoomWidth = 320;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) {
			ChatChannel.Interpreter_intStackSize -= 4;
			Client.field880 = (short)Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize];
			if (Client.field880 <= 0) {
				Client.field880 = 1;
			}

			Client.field864 = (short)Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1];
			if (Client.field864 <= 0) {
				Client.field864 = 32767;
			} else if (Client.field864 < Client.field880) {
				Client.field864 = Client.field880;
			}

			Client.field881 = (short)Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 2];
			if (Client.field881 <= 0) {
				Client.field881 = 1;
			}

			Client.field690 = (short)Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 3];
			if (Client.field690 <= 0) {
				Client.field690 = 32767;
			} else if (Client.field690 < Client.field881) {
				Client.field690 = Client.field881;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) {
			if (Client.viewportWidget != null) {
				Interpreter.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false);
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Client.viewportWidth;
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Client.viewportHeight;
			} else {
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1;
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) {
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Client.zoomHeight;
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Client.zoomWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) {
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = class17.method258(Client.field876);
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = class17.method258(Client.field877);
			return 1;
		} else if (var0 == 6220) {
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6221) {
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6222) {
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = AttackOption.canvasWidth;
			return 1;
		} else if (var0 == 6223) {
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = class0.canvasHeight;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1156700824"
	)
	static final void method281(boolean var0) {
		if (var0) {
			Client.field656 = Login.field1022 ? class126.field1472 : class126.field1471;
		} else {
			Client.field656 = class4.clientPreferences.parameters.containsKey(class125.method2586(Login.Login_username)) ? class126.field1478 : class126.field1475;
		}

	}

	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2012334489"
	)
	static void method282() {
		if (class80.worldMap != null) {
			class80.worldMap.method6287(SoundSystem.Client_plane, class15.baseX * 64 + (class262.localPlayer.x >> 7), WorldMapSprite.baseY * 64 + (class262.localPlayer.y >> 7), false);
			class80.worldMap.loadCache();
		}

	}

	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)Ljava/lang/String;",
		garbageValue = "-1620053364"
	)
	static String method283(String var0, boolean var1) {
		String var2 = var1 ? "https://" : "http://";
		if (Client.gameBuild == 1) {
			var0 = var0 + "-wtrc";
		} else if (Client.gameBuild == 2) {
			var0 = var0 + "-wtqa";
		} else if (Client.gameBuild == 3) {
			var0 = var0 + "-wtwip";
		} else if (Client.gameBuild == 5) {
			var0 = var0 + "-wti";
		} else if (Client.gameBuild == 4) {
			var0 = "local";
		}

		String var3 = "";
		if (Messages.field1397 != null) {
			var3 = "/p=" + Messages.field1397;
		}

		String var4 = "runescape.com";
		return var2 + var0 + "." + var4 + "/l=" + AbstractArchive.clientLanguage + "/a=" + class82.field999 + var3 + "/";
	}
}

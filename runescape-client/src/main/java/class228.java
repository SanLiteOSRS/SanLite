import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("iw")
public class class228 implements class29 {
	@ObfuscatedName("aq")
	char[] field2433;
	@ObfuscatedName("aw")
	int[] field2421;
	@ObfuscatedName("al")
	public int[] field2423;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1387400999
	)
	public int field2431;
	@ObfuscatedName("ar")
	int[] field2425;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1287041361
	)
	int field2424;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1769821383
	)
	int field2427;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -882848297
	)
	int field2426;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 132126029
	)
	int field2429;
	@ObfuscatedName("au")
	boolean[] field2430;
	@ObfuscatedName("ak")
	boolean[] field2422;
	@ObfuscatedName("ah")
	boolean[] field2432;
	@ObfuscatedName("aj")
	public char field2428;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -179142201
	)
	public int field2434;

	public class228() {
		this.field2433 = new char[128]; // L: 8
		this.field2421 = new int[128]; // L: 9
		this.field2423 = new int[128]; // L: 10
		this.field2431 = 0; // L: 11
		this.field2425 = new int[128]; // L: 12
		this.field2424 = 0; // L: 13
		this.field2427 = 0; // L: 14
		this.field2426 = 0; // L: 15
		this.field2429 = 0; // L: 16
		this.field2430 = new boolean[112]; // L: 17
		this.field2422 = new boolean[112]; // L: 18
		this.field2432 = new boolean[112]; // L: 19
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2108130536"
	)
	public boolean vmethod4425(int var1) {
		this.method4428(var1); // L: 24
		this.field2430[var1] = true; // L: 25
		this.field2422[var1] = true; // L: 26
		this.field2432[var1] = false; // L: 27
		this.field2423[++this.field2431 - 1] = var1; // L: 28
		return true; // L: 29
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2132067941"
	)
	public boolean vmethod4442(int var1) {
		this.field2430[var1] = false; // L: 33
		this.field2422[var1] = false; // L: 34
		this.field2432[var1] = true; // L: 35
		this.field2425[++this.field2424 - 1] = var1; // L: 36
		return true; // L: 37
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "-71"
	)
	public boolean vmethod4427(char var1) {
		int var2 = this.field2426 + 1 & 127; // L: 41
		if (var2 != this.field2427) { // L: 42
			this.field2421[this.field2426] = -1; // L: 43
			this.field2433[this.field2426] = var1; // L: 44
			this.field2426 = var2; // L: 45
		}

		return false; // L: 47
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "289932078"
	)
	public boolean vmethod4467(boolean var1) {
		return false;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1730569940"
	)
	void method4428(int var1) {
		int var2 = this.field2426 + 1 & 127; // L: 51
		if (var2 != this.field2427) { // L: 52
			this.field2421[this.field2426] = var1;
			this.field2433[this.field2426] = 0;
			this.field2426 = var2; // L: 55
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-675299948"
	)
	public void method4430() {
		this.field2427 = this.field2429;
		this.field2429 = this.field2426;
		this.field2431 = 0;
		this.field2424 = 0; // L: 67
		Arrays.fill(this.field2422, false);
		Arrays.fill(this.field2432, false);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-994185275"
	)
	public final boolean method4431() {
		if (this.field2427 == this.field2429) { // L: 73
			return false;
		} else {
			this.field2434 = this.field2421[this.field2427];
			this.field2428 = this.field2433[this.field2427];
			this.field2427 = this.field2427 + 1 & 127; // L: 76
			return true; // L: 77
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1518666013"
	)
	public boolean method4450(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2422[var1] : false; // L: 81 82
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "93"
	)
	public boolean method4466(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2430[var1] : false; // L: 86 87
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-223195809"
	)
	public boolean method4440(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2432[var1] : false; // L: 91 92
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "-36"
	)
	public int[] method4434() {
		int[] var1 = new int[this.field2431]; // L: 96

		for (int var2 = 0; var2 < this.field2431; ++var2) { // L: 97
			var1[var2] = this.field2423[var2]; // L: 98
		}

		return var1; // L: 100
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1306645428"
	)
	public int[] method4435() {
		int[] var1 = new int[this.field2424]; // L: 104

		for (int var2 = 0; var2 < this.field2424; ++var2) { // L: 105
			var1[var2] = this.field2425[var2]; // L: 106
		}

		return var1; // L: 108
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZB)I",
		garbageValue = "36"
	)
	static int method4468(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.CC_CREATE) { // L: 484
			Interpreter.Interpreter_intStackSize -= 3; // L: 485
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 486
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 487
			int var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 488
			if (var4 == 0) { // L: 489
				throw new RuntimeException(); // L: 490
			} else {
				Widget var6 = ArchiveLoader.field1070.method6431(var9); // L: 492
				if (var6.children == null) { // L: 493
					var6.children = new Widget[var11 + 1];
				}

				if (var6.children.length <= var11) { // L: 494
					Widget[] var7 = new Widget[var11 + 1]; // L: 495

					for (int var8 = 0; var8 < var6.children.length; ++var8) { // L: 496
						var7[var8] = var6.children[var8];
					}

					var6.children = var7; // L: 497
				}

				if (var11 > 0 && var6.children[var11 - 1] == null) {
					throw new RuntimeException("" + (var11 - 1)); // L: 499
				} else {
					Widget var12 = new Widget(); // L: 500
					var12.type = var4; // L: 501
					var12.parentId = var12.id = var6.id; // L: 502
					var12.childIndex = var11; // L: 503
					var12.isIf3 = true; // L: 504
					if (var4 == 12) { // L: 505
						var12.method6854(); // L: 506
						var12.method6806().method6779(new class106(var12)); // L: 507
						var12.method6806().method6552(new class107(var12)); // L: 517
					}

					var6.children[var11] = var12; // L: 528
					if (var2) { // L: 529
						Interpreter.scriptDotWidget = var12;
					} else {
						class141.field1644 = var12; // L: 530
					}

					UserComparator5.invalidateWidget(var6); // L: 531
					return 1; // L: 532
				}
			}
		} else {
			Widget var3;
			if (var0 == ScriptOpcodes.CC_DELETE) { // L: 534
				var3 = var2 ? Interpreter.scriptDotWidget : class141.field1644; // L: 535
				Widget var10 = ArchiveLoader.field1070.method6431(var3.id); // L: 536
				var10.children[var3.childIndex] = null; // L: 537
				UserComparator5.invalidateWidget(var10); // L: 538
				return 1; // L: 539
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) { // L: 541
				var3 = ArchiveLoader.field1070.method6431(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 542
				var3.children = null; // L: 543
				UserComparator5.invalidateWidget(var3); // L: 544
				return 1; // L: 545
			} else if (var0 != ScriptOpcodes.CC_FIND) { // L: 547
				if (var0 == ScriptOpcodes.IF_FIND) { // L: 560
					var3 = ArchiveLoader.field1070.method6431(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 561
					if (var3 != null) { // L: 562
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 563
						if (var2) { // L: 564
							Interpreter.scriptDotWidget = var3;
						} else {
							class141.field1644 = var3; // L: 565
						}
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 567
					}

					return 1; // L: 568
				} else {
					return 2; // L: 570
				}
			} else {
				Interpreter.Interpreter_intStackSize -= 2; // L: 548
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 549
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 550
				Widget var5 = ArchiveLoader.field1070.method6433(var9, var4); // L: 551
				if (var5 != null && var4 != -1) { // L: 552
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 553
					if (var2) { // L: 554
						Interpreter.scriptDotWidget = var5;
					} else {
						class141.field1644 = var5; // L: 555
					}
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 557
				}

				return 1; // L: 558
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lig;III)Lbf;",
		garbageValue = "-1928191246"
	)
	public static final PcmPlayer method4433(TaskHandler var0, int var1, int var2) {
		if (var1 >= 0 && var1 < 2) { // L: 53
			if (var2 < 256) { // L: 54
				var2 = 256;
			}

			try {
				PcmPlayer var3 = class33.pcmPlayerProvider.player(); // L: 56
				var3.samples = new int[(PcmPlayer.PcmPlayer_stereo ? 2 : 1) * 256]; // L: 57
				var3.field288 = var2; // L: 58
				var3.init(); // L: 59
				var3.capacity = (var2 & -1024) + 1024; // L: 60
				if (var3.capacity > 16384) { // L: 61
					var3.capacity = 16384;
				}

				var3.open(var3.capacity); // L: 62
				if (class362.field3960 > 0 && class27.soundSystem == null) { // L: 63
					class27.soundSystem = new SoundSystem(); // L: 64
					PcmPlayer.soundSystemExecutor = Executors.newScheduledThreadPool(1); // L: 65
					PcmPlayer.soundSystemExecutor.scheduleAtFixedRate(class27.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS); // L: 66
				}

				if (class27.soundSystem != null) { // L: 68
					if (class27.soundSystem.players[var1] != null) { // L: 69
						throw new IllegalArgumentException();
					}

					class27.soundSystem.players[var1] = var3; // L: 70
				}

				return var3; // L: 72
			} catch (Throwable var4) { // L: 74
				return new PcmPlayer(); // L: 75
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("lw")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "341313905"
	)
	static final void method4456(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (ArchiveLoader.field1070.method6437(var0)) { // L: 10654
			ModelData0.field3105 = null; // L: 10661
			class129.drawInterface(ArchiveLoader.field1070.field3633[var0], -1, var1, var2, var3, var4, var5, var6, var7); // L: 10662
			if (ModelData0.field3105 != null) { // L: 10663
				class129.drawInterface(ModelData0.field3105, -1412584499, var1, var2, var3, var4, class103.field1354, WallObject.field3111, var7); // L: 10664
				ModelData0.field3105 = null; // L: 10665
			}

		} else {
			if (var7 != -1) { // L: 10655
				Client.field816[var7] = true;
			} else {
				for (int var8 = 0; var8 < 100; ++var8) { // L: 10657
					Client.field816[var8] = true;
				}
			}

		}
	} // L: 10659 10667
}

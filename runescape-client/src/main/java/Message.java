import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bd")
@Implements("Message")
public class Message extends DualNode {
	@ObfuscatedName("hq")
	@ObfuscatedGetter(
		intValue = -829304695
	)
	@Export("baseY")
	static int baseY;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1158913703
	)
	@Export("count")
	int count;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1040379767
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 2053279727
	)
	@Export("type")
	int type;
	@ObfuscatedName("u")
	@Export("sender")
	String sender;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	@Export("senderUsername")
	Username senderUsername;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("isFromFriend0")
	TriBool isFromFriend0;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("isFromIgnored0")
	TriBool isFromIgnored0;
	@ObfuscatedName("j")
	@Export("prefix")
	String prefix;
	@ObfuscatedName("h")
	@Export("text")
	String text;

	Message(int var1, String var2, String var3, String var4) {
		this.isFromFriend0 = TriBool.TriBool_unknown; // L: 13
		this.isFromIgnored0 = TriBool.TriBool_unknown; // L: 14
		this.set(var1, var2, var3, var4); // L: 19
	} // L: 20

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "32"
	)
	@Export("set")
	void set(int var1, String var2, String var3, String var4) {
		int var5 = ++Messages.Messages_count - 1; // L: 25
		this.count = var5;
		this.cycle = Client.cycle;
		this.type = var1;
		this.sender = var2;
		this.fillSenderUsername(); // L: 31
		this.prefix = var3;
		this.text = var4;
		this.clearIsFromFriend();
		this.clearIsFromIgnored(); // L: 35
	} // L: 36

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1504426889"
	)
	@Export("clearIsFromFriend")
	void clearIsFromFriend() {
		this.isFromFriend0 = TriBool.TriBool_unknown; // L: 39
	} // L: 40

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-35"
	)
	@Export("isFromFriend")
	final boolean isFromFriend() {
		if (this.isFromFriend0 == TriBool.TriBool_unknown) { // L: 43
			this.fillIsFromFriend(); // L: 44
		}

		return this.isFromFriend0 == TriBool.TriBool_true; // L: 46
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1216553895"
	)
	@Export("fillIsFromFriend")
	void fillIsFromFriend() {
		this.isFromFriend0 = MusicPatchPcmStream.friendSystem.friendsList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 50
	} // L: 51

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "12"
	)
	@Export("clearIsFromIgnored")
	void clearIsFromIgnored() {
		this.isFromIgnored0 = TriBool.TriBool_unknown; // L: 54
	} // L: 55

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-282824402"
	)
	@Export("isFromIgnored")
	final boolean isFromIgnored() {
		if (this.isFromIgnored0 == TriBool.TriBool_unknown) { // L: 58
			this.fillIsFromIgnored(); // L: 59
		}

		return this.isFromIgnored0 == TriBool.TriBool_true; // L: 61
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1205982629"
	)
	@Export("fillIsFromIgnored")
	void fillIsFromIgnored() {
		this.isFromIgnored0 = MusicPatchPcmStream.friendSystem.ignoreList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 65
	} // L: 66

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-145006235"
	)
	@Export("fillSenderUsername")
	final void fillSenderUsername() {
		if (this.sender != null) { // L: 69
			this.senderUsername = new Username(class20.method293(this.sender), class162.loginType);
		} else {
			this.senderUsername = null; // L: 70
		}

	} // L: 71

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Lbc;",
		garbageValue = "92669484"
	)
	@Export("getScript")
	static Script getScript(int var0) {
		Script var1 = (Script)Script.Script_cached.get((long)var0); // L: 26
		if (var1 != null) { // L: 27
			return var1;
		} else {
			byte[] var2 = class117.archive12.takeFile(var0, 0); // L: 28
			if (var2 == null) { // L: 29
				return null; // L: 30
			} else {
				var1 = class282.newScript(var2); // L: 32
				Script.Script_cached.put(var1, (long)var0); // L: 33
				return var1; // L: 34
			}
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1896338299"
	)
	public static void method1062() {
		SequenceDefinition.SequenceDefinition_cached.clear(); // L: 361
		SequenceDefinition.SequenceDefinition_cachedFrames.clear(); // L: 362
		SequenceDefinition.SequenceDefinition_cachedModel.clear(); // L: 363
	} // L: 364

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILbc;ZI)I",
		garbageValue = "-189073763"
	)
	static int method1084(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.GETWINDOWMODE) { // L: 3754
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = MouseRecorder.getWindowedMode(); // L: 3755
			return 1; // L: 3756
		} else {
			int var3;
			if (var0 == ScriptOpcodes.SETWINDOWMODE) { // L: 3758
				var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 3759
				if (var3 == 1 || var3 == 2) { // L: 3760
					class67.setWindowedMode(var3);
				}

				return 1; // L: 3761
			} else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) { // L: 3763
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class260.clientPreferences.method2387(); // L: 3764
				return 1; // L: 3765
			} else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) { // L: 3767
				if (var0 == 5310) { // L: 3774
					--TaskHandler.Interpreter_intStackSize; // L: 3775
					return 1; // L: 3776
				} else if (var0 == 5311) { // L: 3778
					TaskHandler.Interpreter_intStackSize -= 2; // L: 3779
					return 1; // L: 3780
				} else if (var0 == 5312) { // L: 3782
					--TaskHandler.Interpreter_intStackSize; // L: 3783
					return 1; // L: 3784
				} else if (var0 == 5350) { // L: 3786
					GrandExchangeOfferAgeComparator.Interpreter_stringStackSize -= 2; // L: 3787
					--TaskHandler.Interpreter_intStackSize; // L: 3788
					return 1; // L: 3789
				} else {
					return var0 == 5351 ? 1 : 2; // L: 3791 3792 3794
				}
			} else {
				var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 3768
				if (var3 == 1 || var3 == 2) { // L: 3769
					class260.clientPreferences.method2334(var3); // L: 3770
				}

				return 1; // L: 3772
			}
		}
	}
}

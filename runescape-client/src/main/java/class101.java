import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cv")
final class class101 implements class294 {
	@ObfuscatedName("vw")
	@ObfuscatedGetter(
		longValue = 5641096588668851147L
	)
	static long field1307;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	final Widget val$cc;

	@ObfuscatedSignature(
		descriptor = "(Lkn;)V"
	)
	class101(Widget var1) {
		this.val$cc = var1; // L: 526
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-462679777"
	)
	public void vmethod5708() {
		if (this.val$cc != null && this.val$cc.method6079().field3415 != null) { // L: 528
			ScriptEvent var1 = new ScriptEvent(); // L: 529
			var1.method2233(this.val$cc); // L: 530
			var1.setArgs(this.val$cc.method6079().field3415); // L: 531
			class420.method7802().addFirst(var1); // L: 532
		}

	} // L: 534

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)[Lgl;",
		garbageValue = "1170073041"
	)
	static HorizontalAlignment[] method2565() {
		return new HorizontalAlignment[]{HorizontalAlignment.HorizontalAlignment_centered, HorizontalAlignment.field1951, HorizontalAlignment.field1950}; // L: 14
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "-968767024"
	)
	static int method2560(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 1010
			var0 -= 1000; // L: 1011
			var3 = class281.getWidget(Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]); // L: 1012
		} else {
			var3 = var2 ? class140.scriptDotWidget : class136.field1589; // L: 1014
		}

		class143.invalidateWidget(var3); // L: 1015
		if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) { // L: 1016
			if (var0 == ScriptOpcodes.CC_SETNPCHEAD) { // L: 1036
				var3.modelType = 2; // L: 1037
				var3.modelId = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 1038
				return 1; // L: 1039
			} else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) { // L: 1041
				var3.modelType = 3; // L: 1042
				var3.modelId = class296.localPlayer.appearance.getChatHeadId(); // L: 1043
				return 1; // L: 1044
			} else {
				return 2; // L: 1046
			}
		} else {
			class379.Interpreter_intStackSize -= 2; // L: 1017
			int var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 1018
			int var5 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 1019
			var3.itemId = var4; // L: 1020
			var3.itemQuantity = var5; // L: 1021
			ItemComposition var6 = MidiPcmStream.ItemComposition_get(var4); // L: 1022
			var3.modelAngleX = var6.xan2d; // L: 1023
			var3.modelAngleY = var6.yan2d; // L: 1024
			var3.modelAngleZ = var6.zan2d; // L: 1025
			var3.modelOffsetX = var6.offsetX2d; // L: 1026
			var3.modelOffsetY = var6.offsetY2d; // L: 1027
			var3.modelZoom = var6.zoom2d; // L: 1028
			if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) {
				var3.itemQuantityMode = 0; // L: 1029
			} else if (var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM | var6.isStackable == 1) { // L: 1030
				var3.itemQuantityMode = 1;
			} else {
				var3.itemQuantityMode = 2; // L: 1031
			}

			if (var3.field3537 > 0) { // L: 1032
				var3.modelZoom = var3.modelZoom * 32 / var3.field3537;
			} else if (var3.rawWidth > 0) { // L: 1033
				var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
			}

			return 1; // L: 1034
		}
	}

	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-445674716"
	)
	static void method2567(int var0, int var1, int var2) {
		if (var0 != 0) { // L: 3844
			int var3 = var0 >> 8; // L: 3845
			int var4 = var0 >> 4 & 7; // L: 3846
			int var5 = var0 & 15; // L: 3847
			Client.soundEffectIds[Client.soundEffectCount] = var3; // L: 3848
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var4; // L: 3849
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0; // L: 3850
			Client.soundEffects[Client.soundEffectCount] = null; // L: 3851
			int var6 = (var1 - 64) / 128; // L: 3852
			int var7 = (var2 - 64) / 128; // L: 3853
			Client.soundLocations[Client.soundEffectCount] = var5 + (var7 << 8) + (var6 << 16); // L: 3854
			++Client.soundEffectCount; // L: 3855
		}
	} // L: 3856

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "911510291"
	)
	@Export("Widget_runOnTargetLeave")
	static void Widget_runOnTargetLeave() {
		if (Client.isSpellSelected) { // L: 9761
			Widget var0 = WorldMapDecoration.getWidgetChild(class124.selectedSpellWidget, Client.selectedSpellChildIndex); // L: 9762
			if (var0 != null && var0.onTargetLeave != null) { // L: 9763
				ScriptEvent var1 = new ScriptEvent(); // L: 9764
				var1.widget = var0; // L: 9765
				var1.args = var0.onTargetLeave; // L: 9766
				ServerPacket.runScriptEvent(var1); // L: 9767
			}

			Client.selectedSpellItemId = -1; // L: 9769
			Client.isSpellSelected = false; // L: 9770
			class143.invalidateWidget(var0); // L: 9771
		}
	} // L: 9772
}

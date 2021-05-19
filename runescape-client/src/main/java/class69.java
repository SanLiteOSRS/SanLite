import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("be")
public class class69 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("reflectionChecks")
	static IterableNodeDeque reflectionChecks;
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "Lcr;"
	)
	@Export("mouseRecorder")
	static MouseRecorder mouseRecorder;
	@ObfuscatedName("eg")
	@ObfuscatedGetter(
		intValue = 593449975
	)
	@Export("worldPort")
	static int worldPort;

	static {
		reflectionChecks = new IterableNodeDeque();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljp;Ljp;I)V",
		garbageValue = "739362816"
	)
	public static void method1153(AbstractArchive var0, AbstractArchive var1) {
		SpotAnimationDefinition.SpotAnimationDefinition_archive = var0;
		SpotAnimationDefinition.SpotAnimationDefinition_modelArchive = var1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "0"
	)
	@Export("addChatMessage")
	static void addChatMessage(int var0, String var1, String var2, String var3) {
		ChatChannel var4 = (ChatChannel)Messages.Messages_channels.get(var0);
		if (var4 == null) {
			var4 = new ChatChannel();
			Messages.Messages_channels.put(var0, var4);
		}

		Message var5 = var4.addMessage(var0, var1, var2, var3);
		Messages.Messages_hashTable.put(var5, (long)var5.count);
		Messages.Messages_queue.add(var5);
		Client.chatCycle = Client.cycleCntr;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)[Loq;",
		garbageValue = "0"
	)
	@Export("FillMode_values")
	public static FillMode[] FillMode_values() {
		return new FillMode[]{FillMode.field4234, FillMode.field4235, FillMode.SOLID};
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1229986351"
	)
	static void method1151() {
		Login.worldSelectOpen = false;
		Canvas.leftTitleSprite.drawAt(Login.xPadding, 0);
		class12.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
		FontName.logoSprite.drawAt(Login.xPadding + 382 - FontName.logoSprite.subWidth / 2, 18);
	}

	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1642265887"
	)
	@Export("queueSoundEffect")
	static void queueSoundEffect(int var0, int var1, int var2) {
		if (class12.clientPreferences.soundEffectsVolume != 0 && var1 != 0 && Client.soundEffectCount < 50) {
			Client.soundEffectIds[Client.soundEffectCount] = var0;
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var1;
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2;
			Client.soundEffects[Client.soundEffectCount] = null;
			Client.soundLocations[Client.soundEffectCount] = 0;
			++Client.soundEffectCount;
		}

	}

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "(Lcg;IIB)V",
		garbageValue = "77"
	)
	@Export("performPlayerAnimation")
	static void performPlayerAnimation(Player var0, int var1, int var2) {
		if (var0.sequence == var1 && var1 != -1) {
			int var3 = Player.SequenceDefinition_get(var1).field1900;
			if (var3 == 1) {
				var0.sequenceFrame = 0;
				var0.sequenceFrameCycle = 0;
				var0.sequenceDelay = var2;
				var0.field1244 = 0;
			}

			if (var3 == 2) {
				var0.field1244 = 0;
			}
		} else if (var1 == -1 || var0.sequence == -1 || Player.SequenceDefinition_get(var1).field1894 >= Player.SequenceDefinition_get(var0.sequence).field1894) {
			var0.sequence = var1;
			var0.sequenceFrame = 0;
			var0.sequenceFrameCycle = 0;
			var0.sequenceDelay = var2;
			var0.field1244 = 0;
			var0.field1215 = var0.pathLength;
		}

	}
}

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kr")
public class class299 {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Llq;Llq;I)V",
		garbageValue = "-1240441597"
	)
	public static void method5766(AbstractArchive var0, AbstractArchive var1) {
		NPCComposition.NpcDefinition_archive = var0;
		NPCComposition.NpcDefinition_modelArchive = var1;
	}

	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-467208096"
	)
	static final void method5767() {
		Scene.Scene_isLowDetail = false;
		Client.isLowDetail = false;
	}
}

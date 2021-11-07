import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ad")
@Implements("SoundCache")
public class SoundCache {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("soundEffectIndex")
	AbstractArchive soundEffectIndex;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("musicSampleIndex")
	AbstractArchive musicSampleIndex;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("musicSamples")
	NodeHashTable musicSamples;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("rawSounds")
	NodeHashTable rawSounds;

	@ObfuscatedSignature(
		descriptor = "(Lko;Lko;)V"
	)
	public SoundCache(AbstractArchive var1, AbstractArchive var2) {
		this.musicSamples = new NodeHashTable(256);
		this.rawSounds = new NodeHashTable(256);
		this.soundEffectIndex = var1;
		this.musicSampleIndex = var2;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II[IS)Laz;",
		garbageValue = "-5017"
	)
	@Export("getSoundEffect0")
	RawSound getSoundEffect0(int var1, int var2, int[] var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >>> 12);
		var4 |= var1 << 16;
		long var5 = (long)var4;
		RawSound var7 = (RawSound)this.rawSounds.get(var5);
		if (var7 != null) {
			return var7;
		} else if (var3 != null && var3[0] <= 0) {
			return null;
		} else {
			SoundEffect var8 = SoundEffect.readSoundEffect(this.soundEffectIndex, var1, var2);
			if (var8 == null) {
				return null;
			} else {
				var7 = var8.toRawSound();
				this.rawSounds.put(var7, var5);
				if (var3 != null) {
					var3[0] -= var7.samples.length;
				}

				return var7;
			}
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II[IB)Laz;",
		garbageValue = "-25"
	)
	@Export("getMusicSample0")
	RawSound getMusicSample0(int var1, int var2, int[] var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >>> 12);
		var4 |= var1 << 16;
		long var5 = (long)var4 ^ 4294967296L;
		RawSound var7 = (RawSound)this.rawSounds.get(var5);
		if (var7 != null) {
			return var7;
		} else if (var3 != null && var3[0] <= 0) {
			return null;
		} else {
			VorbisSample var8 = (VorbisSample)this.musicSamples.get(var5);
			if (var8 == null) {
				var8 = VorbisSample.readMusicSample(this.musicSampleIndex, var1, var2);
				if (var8 == null) {
					return null;
				}

				this.musicSamples.put(var8, var5);
			}

			var7 = var8.toRawSound(var3);
			if (var7 == null) {
				return null;
			} else {
				var8.remove();
				this.rawSounds.put(var7, var5);
				return var7;
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I[II)Laz;",
		garbageValue = "-1852597281"
	)
	@Export("getSoundEffect")
	public RawSound getSoundEffect(int var1, int[] var2) {
		if (this.soundEffectIndex.getGroupCount() == 1) {
			return this.getSoundEffect0(0, var1, var2);
		} else if (this.soundEffectIndex.getGroupFileCount(var1) == 1) {
			return this.getSoundEffect0(var1, 0, var2);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I[IB)Laz;",
		garbageValue = "-64"
	)
	@Export("getMusicSample")
	public RawSound getMusicSample(int var1, int[] var2) {
		if (this.musicSampleIndex.getGroupCount() == 1) {
			return this.getMusicSample0(0, var1, var2);
		} else if (this.musicSampleIndex.getGroupFileCount(var1) == 1) {
			return this.getMusicSample0(var1, 0, var2);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "-566030562"
	)
	static long method807() {
		try {
			URL var0 = new URL(HealthBar.method2246("services", false) + "m=accountappeal/login.ws");
			URLConnection var1 = var0.openConnection();
			var1.setRequestProperty("connection", "close");
			var1.setDoInput(true);
			var1.setDoOutput(true);
			var1.setConnectTimeout(5000);
			OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
			var2.write("data1=req");
			var2.flush();
			InputStream var3 = var1.getInputStream();
			Buffer var4 = new Buffer(new byte[1000]);

			do {
				int var5 = var3.read(var4.array, var4.offset, 1000 - var4.offset);
				if (var5 == -1) {
					var4.offset = 0;
					long var7 = var4.readLong();
					return var7;
				}

				var4.offset += var5;
			} while(var4.offset < 1000);

			return 0L;
		} catch (Exception var9) {
			return 0L;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZI)I",
		garbageValue = "-1520493617"
	)
	static int method799(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_LISTENED) {
			if (class67.guestClanSettings != null) {
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 1;
				SoundSystem.field287 = class67.guestClanSettings;
			} else {
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_AFFINED) {
				var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
				if (Client.currentClanSettings[var3] != null) {
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 1;
					SoundSystem.field287 = Client.currentClanSettings[var3];
				} else {
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCLANNAME) {
				Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = SoundSystem.field287.name;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETALLOWUNAFFINED) {
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = SoundSystem.field287.allowGuests ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKTALK) {
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = SoundSystem.field287.field1444;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKKICK) {
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = SoundSystem.field287.field1439;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKLOOTSHARE) {
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = SoundSystem.field287.field1446;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCOINSHARE) {
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = SoundSystem.field287.field1447;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDCOUNT) {
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = SoundSystem.field287.memberCount;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDDISPLAYNAME) {
				var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = SoundSystem.field287.memberNames[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDRANK) {
				var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = SoundSystem.field287.memberRanks[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDCOUNT) {
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = SoundSystem.field287.bannedMemberCount;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDDISPLAYNAME) {
				var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = SoundSystem.field287.bannedMemberNames[var3];
				return 1;
			} else {
				int var5;
				int var6;
				if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDEXTRAINFO) {
					class14.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize];
					var6 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 2];
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = SoundSystem.field287.method2652(var3, var6, var5);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCURRENTOWNER_SLOT) {
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = SoundSystem.field287.currentOwner;
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETREPLACEMENTOWNER_SLOT) {
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = SoundSystem.field287.field1438;
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDSLOT) {
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = SoundSystem.field287.method2649(Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize]);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETSORTEDAFFINEDSLOT) {
					Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize - 1] = SoundSystem.field287.getSortedMembers()[Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize - 1]];
					return 1;
				} else if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL) {
					class14.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize];
					var6 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1];
					class20.method298(var6, var3);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDJOINRUNEDAY) {
					var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = SoundSystem.field287.field1453[var3];
					return 1;
				} else {
					if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL) {
						class14.Interpreter_intStackSize -= 3;
						var3 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize];
						boolean var4 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1] == 1;
						var5 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 2];
						VarpDefinition.method3003(var5, var3, var4);
					}

					if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDMUTED) {
						var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = SoundSystem.field287.field1454[var3] ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_LISTENED) {
						if (class115.guestClanChannel != null) {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 1;
							WorldMapRegion.field2069 = class115.guestClanChannel;
						} else {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_AFFINED) {
						var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
						if (Client.currentClanChannels[var3] != null) {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 1;
							WorldMapRegion.field2069 = Client.currentClanChannels[var3];
							class133.field1499 = var3;
						} else {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETCLANNAME) {
						Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = WorldMapRegion.field2069.name;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKKICK) {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = WorldMapRegion.field2069.field1511;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKTALK) {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = WorldMapRegion.field2069.field1516;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERCOUNT) {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = WorldMapRegion.field2069.method2809();
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERDISPLAYNAME) {
						var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = ((ClanChannelMember)WorldMapRegion.field2069.members.get(var3)).username.getName();
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERRANK) {
						var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = ((ClanChannelMember)WorldMapRegion.field2069.members.get(var3)).rank;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERWORLD) {
						var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = ((ClanChannelMember)WorldMapRegion.field2069.members.get(var3)).world;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_KICKUSER) {
						var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
						HitSplatDefinition.method3267(class133.field1499, var3);
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERSLOT) {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = WorldMapRegion.field2069.method2817(Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize]);
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETSORTEDUSERSLOT) {
						Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize - 1] = WorldMapRegion.field2069.getSortedMembers()[Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize - 1]];
						return 1;
					} else if (var0 == ScriptOpcodes.CLANPROFILE_FIND) {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = NPC.field1210 != null ? 1 : 0;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}
}

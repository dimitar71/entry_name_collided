# entry_name_collided
Sample project for the issue https://issuetracker.google.com/issues/183632446

# Environment
- MacOS 11.2.3
- Android Studio 4.1.3, 4.1.0-Beta 6, 4.3-Alpha11
- Gradle 6.8.3

# The issue described in the ticket can be summarized as:
- when trying to compile (with Sync, Clean, wipe ccache, etc.), compilation fails with `Entry name 'META-INF/sdk_debug.kotlin_module' collided`
- restarting AS, `Invalidate caches`, deleting `.cache` folder from project and even from my main folder in Mac did not help
- using `exclude` and `pickFirst` did nothing

# What works rarely and randomly:
- `Force Quit` all Java process from Mac `Activity Monitor` app
- sync, clean, run
- repeat above two until compilation is successful
- passes on a 10-15 attempts to force quite processes and re-run
- then comes back in a minute or two

import { MantineProvider } from '@mantine/core';
import { Notifications } from '@mantine/notifications';

function App() {
  return (
    <MantineProvider withGlobalClasses withCssVariables>
      <Notifications />
      <h1>Smart Arborization System</h1>
    </MantineProvider>
  );
}

export default App;